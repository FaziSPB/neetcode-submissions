class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i++) {
            int j=i+1;
            int k=nums.length-1;
            while (j<k) {
            int sum = nums[j]+nums[k];
            if (sum==-nums[i]) {
                res.add(List.of(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
            else if (nums[j]+nums[k]>-nums[i]) {
                k--;
            }
            else j++;
            }
        }
        return new ArrayList<>(res);
    }
}
