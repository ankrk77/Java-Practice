//Write a program to count the frequency of each character in a string. 

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = sc.nextLine().toLowerCase();

        int[] freq = new int[256];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i)]++;
        }
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (freq[ch] != 0) {
                System.out.println(ch + " = " + freq[ch]);
                freq[ch] = 0;
            }
        }
    }
}
