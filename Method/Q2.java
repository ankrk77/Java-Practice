//print → "Hello <name>"

import java.util.Scanner;
public class Q2{

    public static void print(String name){
    System.out.println("Hello "+name);
    }

    public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=sc.nextLine();
    print(name);
    sc.close();
    }

}