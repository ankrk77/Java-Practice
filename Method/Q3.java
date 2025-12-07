//Substract two number.

import java.util.Scanner;

public class Q3 {
   public static int substract(int a, int b){
    return a-b;
   }
    

   public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a=sc.nextInt();
    System.out.println("Enter second number: ");
    int b=sc.nextInt();
    System.out.println("Deference beetween "+ a +" and "+ b + " is "+substract(a, b) );
    substract(a,b);
    sc.close();
   }







}
