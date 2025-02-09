//An e-commerce platform wants to track product ratings. Given an array of product ratings, find the rating that appears most frequently.
public class Rating {
    public static void main(String[] args) {
        double[] max_sales = {9.6, 10.5, 3.8, 9.6, 10.5, 8.4, 9.2, 10.5};

        double frequentRating = max_sales[0];
        int Count1 = 0;

        for (int i = 0; i < max_sales.length; i++) {
            int count2 = 0;
            for (int j = 0; j < max_sales.length; j++) {
                if (max_sales[j] == max_sales[i]) {
                    count2++;
                }
            }
            if (count2 > Count1) {
                Count1 = count2;
                frequentRating = max_sales[i];
            }
        }
        System.out.println("The most frequentl rating is: " + frequentRating);
        System.out.println("Count: "+Count1);
    }
}
