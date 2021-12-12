class Solution {
    public int[] exchange(int[] nums) {
        int start= 0;
        int end = nums.length;
        int[] res = new int[end];
        for (int n: nums){
            if((n & 1) == 1){
                res[start] = n;
                start++;
            }else{
                res[end-1] = n;
                end--;
            }
        }
        return  res;
    }
}