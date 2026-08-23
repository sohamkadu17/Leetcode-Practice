class Solution {
    public int maxProfit(int[] prices) {
        int min_sell = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i<prices.length;i++){
            if(min_sell > prices[i]){
                min_sell = prices[i];
            }
            if(prices[i] - min_sell > max_profit){
                max_profit = prices[i]-min_sell;
            }
        }
        return max_profit;
    }
}
