package practice4;

import java.util.Scanner;

public class ScannerException {                 //error vs exception
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("insert first number: ");
        int a = scanner.nextInt();
        int b;

        System.out.println("insert second number: ");
        try {
            b = scanner.nextInt();
        } catch(Exception e){
            System.out.println("Please try again to insert second int: ");
            b = scanner.nextInt();
        }

        int c = a+b;
        System.out.println("total is: " +c);

    }
}
