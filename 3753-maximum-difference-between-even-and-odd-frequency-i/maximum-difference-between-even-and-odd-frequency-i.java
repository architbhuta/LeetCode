class Solution {
    public int maxDifference(String s) {
        int n= s.length();
        int[] freq = new int[26];
        int maxo = 1;int mine=n;
        for (char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for (int i=0;i<26;i++){
            if(freq[i] % 2 != 0){
                maxo = Math.max(maxo,freq[i]);
            }
            else if(freq[i] % 2 == 0 && freq[i] > 0){
                mine = Math.min(mine,freq[i]);
            }
        }
        return maxo - mine;
    }
}