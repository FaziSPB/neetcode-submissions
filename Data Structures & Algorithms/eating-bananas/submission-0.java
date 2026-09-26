class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max=-1;
        int best = max;
        for (int pile : piles) {
            if (pile>max) max=pile;
        }
        while (min<=max) {
            int k = min+(max-min)/2;
            long time=0;
            for (int pile : piles) {
                time += (pile - 1) / k + 1;
            }
            if (time<=h) {
                best = k;
                max = k-1;
            } else min = k+1;
        }
    return best;
    }
}
