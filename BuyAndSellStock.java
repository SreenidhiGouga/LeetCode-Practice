//(LeetCode-121) Best Time to Buy and Sell Stock
class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                int profit=prices[i]-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
       return maxProfit;     
    }
}
