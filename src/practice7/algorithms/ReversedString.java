package practice7.algorithms;

public class ReversedString {

    public static void main(String[] args) {
        String data= "application";

        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(data);
        String reverseData= stringBuilder.reverse().toString();
        System.out.println(reverseData);

        //find out 2 other ways to do the string reverse- homework
    }
}
