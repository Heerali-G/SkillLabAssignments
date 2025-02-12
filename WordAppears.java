//Write a function to count the number of times each word appears in a given paragraph.

import java.util.Scanner;
public class WordAppears{
    public static void  Wordcount(String paragraph){
        String[] words = paragraph.split("\\s+");
        String[] single_Word = new String[words.length];
        int[] counts = new int[words.length];
        int Count1 = 0;
         for (String word : words) {
            int flag = 0;
        for (int i = 0; i < Count1; i++) {
            if (single_Word[i].equals(word)) {
                counts[i]++;
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
                single_Word[Count1] = word;
                counts[Count1] = 1;
                Count1++;
            }
        }
        for (int i = 0; i < Count1; i++) {
            System.out.println(single_Word[i] + ": " + counts[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String paragraph=sc.nextLine();
        Wordcount(paragraph);
        sc.close();
    }
}
