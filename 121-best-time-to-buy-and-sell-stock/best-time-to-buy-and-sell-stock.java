class Solution {
    public int maxProfit(int[] prices) {
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int i=0;i<prices.length;i++){
            int price = prices[i];
            if(price < low){
                low=price;
            }
            int profit= price-low;
            if(profit>high){
                high=profit;
            }
        } 
        return high;

    }
}