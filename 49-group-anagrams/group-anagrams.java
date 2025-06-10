class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> rstr =new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key= Arrays.toString(count);
            rstr.putIfAbsent(key,new ArrayList<>());
            rstr.get(key).add(s);
        }
        return new ArrayList<>(rstr.values());
    }
}