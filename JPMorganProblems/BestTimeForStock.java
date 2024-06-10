class Solution {
  public int maxProfit(int[] prices) {
      if (prices.length == 0) return 0;

      int low = prices[0];
      int max_profit = 0;

      for (int i = 1; i < prices.length; i++) {
          if (prices[i] < low) {
              low = prices[i]; // Update low when a new minimum is found
          } else if (prices[i] - low > max_profit) {
              max_profit = prices[i] - low; // Update max_profit if current profit is higher
          }
      }
      return max_profit;
  }
}


