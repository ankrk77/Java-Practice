//Write a function to check if a number is positive, negative, or zero.

import java.util.Scanner;

public class Q16 {
    public static void checkNumber(int num){
        if(num > 0){
            System.out.println("Your number is Positive");
        }else if(num < 0){
            System.out.println("Your number is Negative");
        }else{
            System.out.println("Your number is Zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        checkNumber(num);
        sc.close();

    }
}
