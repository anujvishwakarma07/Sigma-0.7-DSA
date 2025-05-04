/**
 * ❓ Question 3: Best Time to Buy and Sell Stock
 * 
 * You are given an array `prices` where `prices[i]` is the price of a given stock on the i-th day.
 * Return the maximum profit you can achieve from this transaction.
 * 
 * If you cannot achieve any profit, return 0.
 * 
 * ✨ Example 1:
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: 
 * Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
 * You must buy before you sell.
 * 
 * ✨ Example 2:
 * Input: prices = [7, 6, 4, 3, 1]
 * Output: 0
 * Explanation: 
 * In this case, no transactions are done and the max profit = 0.
 * 
 * 🔒 Constraints:
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 */

public class q3 {
    public static int stocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

            for(int i = 0; i < prices.length; i++){
                if(buyprice < prices[i]){
                    int profit  = prices[i] - buyprice;
                    maxProfit = Math.max(maxProfit, profit);
                }else{
                    buyprice = prices[i];
                }
            }
            return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 6, 4, 3, 1};
        System.out.println(stocks(prices));
    }
}
