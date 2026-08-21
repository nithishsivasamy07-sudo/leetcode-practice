class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(mp.get(n)%2==1) return false;
        }
        return true;
    }
}