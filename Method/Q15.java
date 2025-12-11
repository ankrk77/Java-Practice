//Write a function to count digits in a number

import java.util.Scanner;

public class Q15 {
    public static int countDigit(int num){
        int count=0;
        if(num==0)return 1;
        if(num<0){num=-num;}
        while (num!=0) {
            num=num/10;
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Total number of Digit in your number is "+countDigit(num));
        sc.close();
    }
}
