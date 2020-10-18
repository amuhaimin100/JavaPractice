package practice4;

public class Conditions {

    // soccer- sunday
    // class- monday
    // guitar- friday
    //chill at my home= other days

    public static void main(String[] args) {
        String today = "monday";

        // if(condition)--ends{
        //}

        if (today.equalsIgnoreCase("sunday")) {  //can use equals(make sure spells the same way as variable value) or equalsignorecase
            System.out.println("I'll go to soccer");
        } else if (today.equalsIgnoreCase("monday")) {
            System.out.println("I'll go to Class");
        } else if (today.equalsIgnoreCase("friday")) {
            System.out.println("I'll play guitar");
        } else {
            System.out.println("I'll hangout with my friends");
        }


        int year = 2021;
        if (year==2020) {
            System.out.println("horrible year");
        } else {
            System.out.println("normal");
        }

        boolean isTodaySunny= true;
        if (!isTodaySunny) {                        // put ! before boolean data to say if it's not
            System.out.println("let's go fishing");
        }else {
            System.out.println("let's stay home");
        }
        // || -- or

        int a =5;
        if (a==5|| a>6) {
            System.out.println(a);
        }

        // && -- and

        if (a==5 && a>4){
            System.out.println(("today is the day"));
        }


        // != -- not equals

        if (a!=4){
            System.out.println("a is not equals: "+a);
        }

        // == -- equals

        if (a==5){
            System.out.println("we're done");
        }


    }
}

