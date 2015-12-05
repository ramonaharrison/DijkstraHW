package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.List;

/**
 * Access Code 2.1
 * Ramona Harrison
 * InterviewCakeI.java
 *
 * Suppose we could access yesterday's stock prices as a list, where:

 The indices are the time in minutes past trade opening time, which was 9:30am local time.
 The values are the price in dollars of Apple stock at that time.
 So if the stock cost $500 at 10:30am, stock_prices_yesterday[60] = 500.

 Write an efficient function that takes stock_prices_yesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

 For example:

 stock_prices_yesterday = [10, 7, 5, 8, 11, 9]

 get_max_profit(stock_prices_yesterday)
 # returns 6 (buying for $5 and selling for $11)

 No "shorting"—you must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).
 *
 */

public class InterviewCakeI {
    public static int getMaxProfit(List<Integer> stockPricesYesterday) {
        int min = stockPricesYesterday.get(0);
        int max = stockPricesYesterday.get(0);
        int potentialMin = stockPricesYesterday.get(0);

        for (int i = 0; i < stockPricesYesterday.size(); i++) {
            if (potentialMin > stockPricesYesterday.get(i)) {
                potentialMin = stockPricesYesterday.get(i);

            }
            if (max < stockPricesYesterday.get(i)) {
                max = stockPricesYesterday.get(i);
                min = potentialMin;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        List<Integer> stockPricesYesterday = new ArrayList<Integer>();
        stockPricesYesterday.add(10);
        stockPricesYesterday.add(7);
        stockPricesYesterday.add(5);
        stockPricesYesterday.add(8);
        stockPricesYesterday.add(11);
        stockPricesYesterday.add(9);

        System.out.println(getMaxProfit(stockPricesYesterday));
    }
}
