//You work for a mobile app development company that specializes in creating educational apps for kids. One of your tasks is to develop a game that helps children learn and recognize different digits.
//The game includes a feature where a list of numbers is provided, and the child needs to identify all the distinct digits present in that list.
//The goal is to find all unique digits from the given array of integers.
//Here we used HashMap
import java.util.Arrays;
import java.util.HashMap;
public class DistinctDigit {
    public static void main(String[] args) {
        int[] N = {00,11,54,666,723};
        int index=0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int number : N) {
            int rem=number%10;
                map.put(rem,true);
                while (number >0) {
                    int digit = number % 10; 
                    number /= 10; 
                    map.put(digit,true);
                    
                }
          }
          int[] distinctDigits = new int[map.size()];
          for (Integer digit : map.keySet()) {
            distinctDigits[index++] = digit;
        }        
        System.out.println(Arrays.toString(distinctDigits));
    }
}
