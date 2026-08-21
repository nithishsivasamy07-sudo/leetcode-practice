class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        char ch='\0';
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)==2) return c;
        }
        return ch;
    }
}