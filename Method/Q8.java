//Write a function that returns whether a number is even.

// import java.util.Scanner;

// public class Q8 {
//     public static int check(int num){
//         if(num%2==0){
//             return 1;
//         }else{
//             return 0;
//         }

//     } 
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int num = sc.nextInt();
//         int result= check(num);
//         if (result==1){
//             System.out.println("Your number is Even");
//         }else{
//             System.out.println("Your number is Odd");
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class Q8 {
    public static boolean check(int num){
        return (num%2==0);

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        if (check(num)){
            System.out.println("Your number is Even");
        }else{
            System.out.println("Your number is Odd");
        }
        sc.close();
    }
}
