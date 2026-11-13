class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int n : nums){
            numbers.add(n);
        }
        return numbers.size() < nums.length;
    }
}