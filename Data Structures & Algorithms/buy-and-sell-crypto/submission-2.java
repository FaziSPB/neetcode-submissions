class Solution {
    public int maxProfit(int[] prices) { 
        int left = 0;
        int profit = 0; 
        for (int right = 0; right<prices.length;right++) { 
            if (prices[left]<prices[right]&&prices[right]-prices[left]>profit) profit = prices[right]-prices[left];
            if (prices[right] < prices[left]) left = right; 
        }
        return profit;
    }
}
