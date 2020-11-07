package review;

// write an application which will print selenium 5 times
// for each selenium , it will print java 3 times
// when java is getting printed for second and third time, print "i hate java" instead of "java"
// and for the 3rd and 5th time of selenium print, instead of "selenium", print "i love selenium"
//if selenium gets printed for third time and java gets printed for second time print your name

public class Loops {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            if (i==2 || i==4){

                if(i==2){
                    System.out.println("Abir");
                }else {
                    System.out.println("i love selenium");
                }

            }else{
                System.out.println("selenium");
            }
            for(int j=0; j<3; j++){
                if(j==1 || j==2) {
                    System.out.println("i hate java");
                }else {
                    System.out.println("java");}


                }
            }
        }
    }

