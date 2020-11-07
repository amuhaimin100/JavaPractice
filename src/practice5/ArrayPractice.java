package practice5;

import org.w3c.dom.ls.LSOutput;

public class ArrayPractice {

    public static void main(String[] args) {


        String[] names = {"Adnan", "Rahman", "Rahat"};


       // System.out.println(names[0]);
       // System.out.println(names[2]);

        for(int i=0;i<3;i++){
            System.out.println(names[i]);

        }

        int[]numbers= {143,345,567,444};

        Object[]everything= {11734,"USA",true, 'f'};
        System.out.println(everything[2]);

        Object zipcode= everything[0];
        System.out.println(zipcode);


    }
}