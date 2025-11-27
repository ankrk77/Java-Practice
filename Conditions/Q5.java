// Exam marks: if 90 → A grade,if 80 → B, if 60 → C and if else → Fail
package Conditions;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        int mark = sc.nextInt();

        if (mark == 90) {
            System.out.println("Grade A");            
        }else if(mark == 80){
            System.out.println("Grade B");
        }else if(mark == 60){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }

        sc.close();
    }
}
