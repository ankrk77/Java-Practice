//Write a function to calculate factorial of a number.

import java.util.Scanner;

public class Q13 {
    public static void factorial(int num){
        int result=num;
        for(int i=num-1;i>0;i--){
            result =result*i;
        }
        System.out.println("Factorial is "+ result );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        factorial(num);
        
        sc.close();
    }
}
