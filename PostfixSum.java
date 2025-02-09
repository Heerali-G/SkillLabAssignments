//You are a data analyst for a logistics company that tracks the fuel consumption of delivery vehicles throughout their routes. 
//The company wants to optimize fuel usage by analyzing the remaining fuel capacity after each delivery point.
import java.util.Arrays;
public class PostfixSum
{
    public static void main(String[] args)
    {
        int[] fule = {5, 10, 3, 7, 8};
        int[] postfixSum = new int[fule.length];
        System.out.println("fule: "+Arrays.toString(fule));
        if (fule.length > 0)
        {
            postfixSum[fule.length-1] = fule[fule.length-1];
            for (int i = fule.length-2; i >=0; i--)
            {
                postfixSum[i] = fule[i] + postfixSum[i+1];
            }
        }      
        System.out.println("PostfixSum: " +Arrays.toString(postfixSum));
    }
}
