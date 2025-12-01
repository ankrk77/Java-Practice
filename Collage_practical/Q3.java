//Write a Java program to store and display a list of student names using ArrayList.
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            students.add(name);
        }
        System.out.println("\nList of Students:");
        for (String s : students) {
            System.out.println(s);
        }
        sc.close();
    }
}
