package practice4.oop.classwork;

public class FoodFastUI extends FoodFast implements FoodDelivery {


    @Override
    public void speed() {
        System.out.println("we deliver within 20 mins");

    }

    @Override
    public void cost() {
        System.out.println("we have no delivery cost");

    }

    @Override
    public void service() {

        System.out.println("great customer service");

    }

    @Override
    public void route() {
        System.out.println("only works within the city");

    }
}
