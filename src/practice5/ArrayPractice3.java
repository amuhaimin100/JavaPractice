package practice5;

import java.util.Random;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Random random= new Random();
        int x = random.nextInt(1000);

        int[]numbers= new int[4];

        //1st loop to insert a random int in the array and fill all the index

        numbers[0]=random.nextInt(50);
        numbers[1]=random.nextInt(50);
        numbers[2]=random.nextInt(50);
        numbers[3]=random.nextInt(50);

        for(int n=0; n<random.nextInt(50); n++)
        {
           // System.out.println(numbers[n]);
        }
        //random int every time


        System.out.println(x); //running will create random data within 1000

        //2nd loop to print all int from the array
        for (int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[2]);
    }
}
