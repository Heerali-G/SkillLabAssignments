//Stock Market – Minimum Stock Price Over a Time Period.

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class MinStockPrice {
    public static int[] minStockPrices(int[] stockPrices, int k) {
        int[] result = new int[stockPrices.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int index = 0; index < stockPrices.length; index++) {
            if (!deque.isEmpty() && deque.peekFirst() < index - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && stockPrices[deque.peekLast()] > stockPrices[index]) {
                deque.pollLast();
            }
            deque.offerLast(index);
            if (index >= k - 1) {
                result[index - k + 1] = stockPrices[deque.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] stockPrices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        int[] got = minStockPrices(stockPrices, k);
        System.out.println(Arrays.toString(got)); 
    }
}
