package practice5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        //homework
        //from the user, take 5 food they like
        //give them a random food to eat

            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your favorite food");
            String input1 = scanner.nextLine();
            String f1=input1;
            System.out.println("What's the second one?");
            String input2 = scanner.nextLine();
            String f2=input2;
            System.out.println("Third favorite?");
            String input3 = scanner.nextLine();
            String f3=input3;
            System.out.println("Fourth?");
            String input4 = scanner.nextLine();
            String f4=input4;
            System.out.println("And the last one?");
            String input5 = scanner.nextLine();
            String f5= input5;


            String [] food= {f1,f2,f3,f4,f5};

           Random random= new Random();

        System.out.println("You can only have: "+(food[random.nextInt(food.length)]));







    }
}