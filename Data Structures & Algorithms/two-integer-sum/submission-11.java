class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h1 = new HashMap<>();
        for (int i=0; i<nums.length;i++) {
            int second = target - nums[i];
            if (h1.containsKey(second)) {
                return new int[] { h1.get(second), i};
            }
            h1.put(nums[i], i);
        }
    return new int[] {};
    }
}
