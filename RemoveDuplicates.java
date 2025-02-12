//Write a function to remove duplicate characters from a string and return the modified string.
import java.util.Scanner;
public class RemoveDuplicates {
    public static String removeDuplicateCharacters(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");//Ex: input : banana
        String input = scanner.nextLine();
        String result = removeDuplicateCharacters(input);
        System.out.println("Modified string without duplicates: " + result);// output: ban
        scanner.close();
    }
}

