class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> anslst = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            anslst.add(new ArrayList<>());
        }
        anslst.get(0).add(1);

        for(int i=1; i<numRows; i++){
            anslst.get(i).add(1);
            List<Integer> prevlst = anslst.get(i-1);

            for(int j=0; j< prevlst.size() - 1; j++){
                anslst.get(i).add(prevlst.get(j)+ prevlst.get(j+1));
            }
            anslst.get(i).add(1);
        }
        return anslst;
    }
}