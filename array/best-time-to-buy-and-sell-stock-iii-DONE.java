/*
 Say you have an array for which the i th element is the price of a given stock
on day i .  Design an algorithm to find the maximum profit. You may complete at
most two transactions.  Note: You may not engage in multiple transactions at the
same time (ie, you must sell the stock before you buy again).   Subscribe to see
which companies asked this question    Show Tags   Array  Dynamic Programming
Show Similar Problems   (E) Best Time to Buy and Sell Stock  (M) Best Time to
Buy and Sell Stock II  (H) Best Time to Buy and Sell Stock IV
*/


public class Solution {
    public int maxProfit(int[] prices) {
      if (prices==null || prices.length<2)
        return 0;
      int result=0;
      int[] left=new int[prices.length];
      int[] right=new int[prices.length];

      int max=0;
      int min=prices[0];
      left[0]=0;
      for(int i=1;i<prices.length;i++){
        min=Math.min(min,prices[i]);
        left[i]=Math.max(max,prices[i]-min);;
      }

      max=prices[prices.length-1];
      right[prices.length-1]=0;
      for(int i=prices.length-2;i>=0;i--){
        max=Math.max(max,prices[i]);
        right[i]=Math.max(right[i+1],max-prices[i]);
      }

      for(int i=0;i<prices.length;i++){
        result=Math.max(result,left[i]+right[i]);
      }
      return result;
    }
}
