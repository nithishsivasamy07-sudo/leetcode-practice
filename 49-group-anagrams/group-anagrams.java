class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map=new HashMap<String,List<String>>();
        for(String word:strs){
            char []ch=word.toCharArray();
            Arrays.sort(ch);
        String key=new String(ch);
        map.computeIfAbsent(key,k->new ArrayList<>()).add(word);
    }
    return new ArrayList<>(map.values());
}
}