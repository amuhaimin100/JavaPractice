package practice3;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //^^^make sure to click on the first one when you type Scanner java.util

        System.out.println("enter your name: ");
        String name=scanner.next();

        System.out.println("Welcome to the world of Java Mr. "+name);

        scanner.close();
    }

//    public static void calculator(){
//
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter your name: ");



    }


