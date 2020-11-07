package practice5;

public class Laptop {

    //Singleton-- single instance of a class
    //purpose is to reduce obj creation in other classes, by using getInstance()


    //1. private static object of the class(half way)
    private static Laptop laptop=null;


    //2. private constructor
    private Laptop(){
    }


    //3. public static method which has return type of the class (object)
    public static Laptop getInstance(){
        if(laptop==null){
            laptop=new Laptop(); 

        }
        return laptop;
    }

    public String getModelofTheLaptop(){
        return "Macbook pro";
    }
}
