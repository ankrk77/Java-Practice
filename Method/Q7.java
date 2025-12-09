//Write a function that returns the cube of a number.

import java.util.Scanner;

public class Q7 {
    public static int cube(int num){
        return num*num*num;
    }
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("The cube of your number is "+ cube(num));
        sc.close();
    }
}
