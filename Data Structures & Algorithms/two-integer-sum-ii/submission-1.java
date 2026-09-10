class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length-1;
        int i=0;
        while (i<n) {
            int sum = numbers[i]+numbers[n];
            if (sum==target) break;
            else if (numbers[i]+numbers[n]>target) {
                n--;
            }
            else i++;
        }
        int[] res = {i+1,n+1};
    return res;
    }
}
