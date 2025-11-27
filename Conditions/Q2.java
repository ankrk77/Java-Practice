//Temperature > 30 ho to "Hot", otherwise "Normal" print karo.
package Conditions;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = sc.nextInt();

        if(temp > 30){
            System.out.println("Hot");
        }else{
            System.out.println("Normal");
        }

        sc.close();
    }
}