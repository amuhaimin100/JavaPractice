package practice4.oop.encapsulation;

public class Student {

    /*
    oop
    Encapsulation : data hiding (Setter and Getter method) It is a template class
    Polymorphism:
    --method overloading -- same method name, different parameters in the same class
    also known as static polymorphism or compile time polymorphism
    --method overriding --
    Inheritance
    Abstraction

     */

  private   String nameofStudent;
    private int idofStudent;

    //homework
    private String ssn;
    private String location;
    private String gender;

    //setter method
    //getter method

    public void setprintstudent1(){
        System.out.println(nameofStudent);
        System.out.println(idofStudent);
    }
}
