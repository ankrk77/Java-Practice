//Write a function to print multiplication table of a number.
import java.util.Scanner;

public class Q12 {
    public static void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        printTable(num);
        sc.close();

    }
}
