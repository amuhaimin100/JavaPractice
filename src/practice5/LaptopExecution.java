package practice5;

public class LaptopExecution {
    public static void main(String[] args) {
        Laptop laptop= Laptop.getInstance();
        String model= laptop.getModelofTheLaptop();
        System.out.println(model);
    }
}
