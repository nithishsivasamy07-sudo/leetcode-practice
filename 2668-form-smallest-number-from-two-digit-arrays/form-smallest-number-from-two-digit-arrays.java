class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
         Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int n:nums1) mp.put(n,mp.getOrDefault(n,0)+1);
        for(int n:nums2) mp.put(n,mp.getOrDefault(n,0)+1);
        for(int n:nums1){
            if(mp.get(n)==2) return n;
        } int n=0;
        if(nums1[0]<nums2[0]){
         n=nums1[0]*10;
        n+=nums2[0];
        }
        else{
             n=nums2[0]*10;
        n+=nums1[0];
        }
        return n;
    }
}