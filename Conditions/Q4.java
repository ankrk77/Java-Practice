//2 numbers me se bada number print karo.
package Conditions;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("greate number is " + num1);
        }else if (num2>num1) {
            System.out.println("greate number is " + num1);
        }else{
            System.out.println("Both number are Equal");
        }

        sc.close();
    }
    
}
