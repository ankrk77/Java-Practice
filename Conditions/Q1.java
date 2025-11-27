//Write a program to check a number positive, negative, or zero
package Conditions;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Your number is Positive");
        }else if(num<0){
            System.out.println("Your number is Negative");
        }else{
            System.out.println("Your number is Zero");
        }

        sc.close();
    }
    
}