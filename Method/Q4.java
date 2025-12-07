//Return your age

import java.util.Scanner;

public class Q4 {
    public static int getAge(int age){
        return age;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Your age is "+getAge(age));
        sc.close();
    }
}
