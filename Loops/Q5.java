//Kisi number ka table print karo (e.g., 5 ka table)
package Loops;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            int table = num*i;
            System.out.println(table);
        }

        sc.close();
    }
    
}
