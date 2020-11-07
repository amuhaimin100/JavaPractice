package practice7.algorithms;

public class ReversedString3 {

    public static void main(String[] args) {
        String data= "CoronaVirus";
        String rev="";

        for(int i=data.length()-1;i>=0;i--){
            rev= rev+data.charAt(i);
        }

        System.out.println(rev);
    }
}
