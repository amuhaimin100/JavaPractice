package review;

public class SortingAlgorithm {
    public static void main(String[] args) {

        //selection sort


        int[] numbers = {3, 1, 10,-15, 2, 5, 3,-45, 100};

        for (int i = 0; i< numbers.length; i++) {
            for (int j=i+1; j< numbers.length; j++){
                if (numbers[j]<numbers[i]){

                    int tmp= numbers[j];
                    numbers[j]= numbers[i];
                    numbers[i]=tmp;

                }
            }
        }

            for (int i=0; i< numbers.length; i++){
                System.out.println(numbers[i]);
            }
    }
}