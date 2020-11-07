package practice7.algorithms;

public class ReverseString2 {

    public static void main(String[] args) {

       String rev2= reverse("CoronaVirus");
       System.out.println(rev2);

    }

    public static String reverse(String rev){
        char[]characters= new char[rev.length()];

        //step 1:
        for(int i=0; i<rev.length();i++){
            System.out.println(rev.charAt(i));
        }
        //step 2:
        for(int r=rev.length()-1;r>=0;r--){
            System.out.println(rev.charAt(r));
        }
        //step 3:
        int letterIndex=0;
        for(int l=rev.length()-1;l>=0;l--){
            characters[letterIndex]=rev.charAt(l);
            letterIndex++;
        }
        String reverse="";
        for (int a=0; a<rev.length();a++){
            reverse=reverse+characters[a];

        }
        return reverse;
    }
}
