//A sales company wants to analyze daily sales data. Given an array of sales numbers, find the day with the highest sales.
public class HighestSalesDay {
    public static void main(String[] args) {
        double[] sales = {1000.50, 1200.75, 950.20, 1500.80, 1100.30};
        if (sales == null || sales.length == 0) {
            System.out.println("No sales data.");
            return; 
        }
        int highestSalesDay = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[highestSalesDay]) {
                highestSalesDay = i;
            }
        }
        System.out.println("Highest sales day: " + (highestSalesDay + 1) + " (" + sales[highestSalesDay] + ")");
    }
}
