package topInterviewQuestions.easy.array.bestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i])
                profit += prices[i + 1] - prices[i];
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(new Solution().maxProfit(prices));
    }
}
