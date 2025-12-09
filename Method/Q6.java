//Write a function that returns the square of a number.

//                 Prefered

import java.util.Scanner;

public class Q6 {
    public static int square(int num){
        return num*num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("The Square of your number is : "+square(num) );
        sc.close();
    }
}

// import java.util.Scanner;

// public class Q6 {
//     public static int square(int num){
//         int result=num*num;
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter your number: ");
//         int num = sc.nextInt();
//         System.out.println("The Square of your number is : "+ result );

//         square(num);
//     }
// }

// import java.util.Scanner;

// public class Q6 {
//     public static void square(int num){
//         System.out.println("The Square of your number is : "+ num*num);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter your number: ");
//         int num = sc.nextInt();

//         square(num);
//     }
// }

// import java.util.Scanner;

// public class Q6 {
//     public static void square(int num){
//         int result = num*num;
//         System.out.println("The Square of your number is : "+ result);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter your number: ");
//         int num = sc.nextInt();

//         square(num);
//     }
// }
