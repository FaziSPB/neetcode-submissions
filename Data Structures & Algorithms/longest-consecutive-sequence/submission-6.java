class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        else if (nums.length == 0) return 0;
        int maxStreak = 1;
        int currentStreak = 1;
        int x = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
            x = num;
            while (set.contains(x+1)) {
            x++;
            currentStreak++;
            }}
        maxStreak = Math.max(maxStreak, currentStreak);
        currentStreak = 1;}
    return maxStreak;
    }
}
