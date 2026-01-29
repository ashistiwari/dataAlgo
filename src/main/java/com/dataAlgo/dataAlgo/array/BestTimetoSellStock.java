package com.dataAlgo.dataAlgo.array;

public class BestTimetoSellStock {

    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int ans=prices[0];

        for (int i=1;i<=prices.length;i++){
            int profit= prices[i]-minPrice;
            if (profit>ans){
            ans=profit;}
            minPrice=Math.min(minPrice,prices[i]);
        }
        return ans;
    }

}
