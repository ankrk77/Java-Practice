//Write a function to return the larger of two numbers.

// import java.util.Scanner;

// public class Q9 {
//     public static boolean check(int num1, int num2){
//         return num1>num2;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter your second number: ");
//         int num2 = sc.nextInt();
//         if(check(num1,num2)){
//             System.out.println("Greater number is "+num1);
//         }else{
//             System.out.println("Greater number is "+num2);
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;
public class Q9 {
    public static int check(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Greater number is "+check(num1, num2) );
        sc.close();
    }
}
