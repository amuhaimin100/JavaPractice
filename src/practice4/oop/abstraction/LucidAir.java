package practice4.oop.abstraction;

public class LucidAir extends RunableCar{

    public static void main(String[] args) {
        LucidAir lucidAir= new LucidAir();
        lucidAir.start();
    }

    @Override
    public void start() {
        super.start();
    }
}
