class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prefix = 1;
        res[0] = prefix;
        int suffix = 1;
        for (int i=1; i<nums.length; i++) {
            prefix = prefix * nums[i-1];
            res[i] = prefix;}
        for (int j=nums.length-2; j>=0;j--) {
            suffix = suffix * nums[j+1];
            res[j] = suffix * res[j];
        }
        return res;
    }
}  
