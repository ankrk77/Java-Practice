//Write a function to return the reverse of a number.

import java.util.Scanner;

public class Q14 {
    public static int  reverse(int num){
        int digit;
        int reverse = 0;
        while(num!=0){
            digit = num%10;
            reverse = reverse * 10 + digit; 
            num = num/10;
        }
        
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Reverse of your number is "+reverse(num));
        sc.close();
    }
}
