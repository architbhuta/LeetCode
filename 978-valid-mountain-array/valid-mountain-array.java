class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3){
            return false;
        }
        int n= arr.length;
        int l = 0,r = n-1;

        while((l < n-1)&&(arr[l] < arr[l+1])){
            l++;
        }

        while((r-1 >= 0)&&(arr[r] < arr[r-1])){
            r--;
        }

        if((l > 0)&&(r < n-1 )&&(l == r)){
            return true;
        }
        return false;
    }
}
