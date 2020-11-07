package practice4.oop.abstraction;

public abstract class Car {

    //abstract class has constructor but still can't create object
    //methods that are abstruct we need to specify as abstruct
    //we can extend abstract class to abstract class, but only once

    //public Car();


    public void brake(){
        System.out.println("car has to stop via this");
    }



    //abstract method ==concepts
    public abstract void wheels();

}
