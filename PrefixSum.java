//You work as a software engineer for a company that manages online retail stores. The company wants to implement a feature that provides real-time insights into daily sales trends.
//One of the key metrics is the cumulative sales amount up to a specific hour of the day.
import java.util.Arrays;
public class PrefixSum
{
    public static void main(String[] args)
    {
        int[] sales = {100, 150, 200, 50, 250};
        int[] prefixSum = new int[sales.length];
        System.out.println("Sales: "+Arrays.toString(sales));
        if (sales.length > 0)
        {
            prefixSum[0] = sales[0];
            for (int i = 1; i < sales.length; i++)
            {
                prefixSum[i] = prefixSum[i - 1] + sales[i];
            }
        }
        System.out.println("PrefixSum: " +Arrays.toString(prefixSum));
    }
}
