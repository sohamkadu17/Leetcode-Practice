class Solution {
    public int maxProfit(int[] prices) {
        int min_sell = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length; i++){
            if(prices[i] < min_sell){
                min_sell = prices[i];
            }
             if(prices[i] - min_sell > profit){
                profit = prices[i] - min_sell;
            }
        }
        return profit;
    }
}
