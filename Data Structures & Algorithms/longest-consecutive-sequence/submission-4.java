class Solution {
    public int longestConsecutive(int[] nums) {
        int maxStreak = 1;
        int currentStreak = 1;
        if (nums.length == 1) return 1;
        else if (nums.length == 0) return 0;
        Arrays.sort(nums);
        for (int i=1; i<nums.length;i++) {
            if (nums[i] - nums[i-1] == 1) {
                currentStreak++;
            }
            if (nums[i]-nums[i-1]>1) {
                if (maxStreak<currentStreak) {
                    maxStreak=currentStreak;
                }
                currentStreak=1;
            }
            if (maxStreak<currentStreak) {
                    maxStreak=currentStreak;
                }
        }
        return maxStreak;
    }
}
