//Write a function to return the sum of digits of a number.

import java.util.Scanner;

public class Q18 {
    public static int sumDigit(int num){
        int sum=0;
        while (num!=0) {
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("The Sum of disits of Your number is: "+  sumDigit(num));
        sc.close();
    }
}
