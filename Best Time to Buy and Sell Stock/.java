class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int potentialProfit = currentPrice - minPrice;
            if(potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
            if(currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
}
