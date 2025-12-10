//Write a function to calculate the area of a circle.

import java.util.Scanner;

public class Q10 {
    public static double calculateArea(double radius){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of Circle: ");
        double radius = sc.nextDouble();
        System.out.println("The area of circle is : "+ calculateArea(radius));
        sc.close();
    }
}
