//Write a function to check if a number is prime.

import java.util.Scanner;

public class Q17 {
    public static void numCheck(int num){
        if(num < 2){
            System.out.println("Number is not Prime");
            return;
        }
        
            boolean isPrime=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Number is Prime");
            }else{
                System.out.println("Number is not Prime");
            }
        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        numCheck(num);
        sc.close();
    }
}
