package practice4.oop.abstraction;

public interface Vehicle {      //interface can not have any body. interface is created for concepts(method name, no body)


    //concept: method name, no body

    //interface can't have constructor, so we can't create obj
    //interface can extends multiple interfaces (can have 2 parents)
    //interface's all methods are public

    public void move();

    public void start();

    public void stop();

    public void name();

}
