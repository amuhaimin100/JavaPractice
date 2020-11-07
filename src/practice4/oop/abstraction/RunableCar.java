package practice4.oop.abstraction;

public class RunableCar extends Car implements Vehicle {

    // implements - interface
    // extends - class/abstract class
    // you can implement more than one interface/multiple interface
    // can not have multiple abstract class/ 1 abstract class

    @Override
    public void wheels() {
        System.out.println("4 wheels");
    }

    @Override
    public void move() {
        System.out.println("car is moving");

    }
    //method overriding (part of polymorphism): same method name, different/same params, in the different class
    //also known as dynamic poplymorphism or run time polymorphism
    @Override
    public void start() {

        System.out.println("car starts");
    }

    @Override
    public void stop() {
        System.out.println("car stops");

    }

    @Override
    public void name() {
        System.out.println("car name: Ford");

    }
}
