//Q1. Create a method add(int a, int b) that returns the sum.
import java.util.Scanner;

public class Q1 {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result = add(a,b);
        System.out.println(result);

    }
}
