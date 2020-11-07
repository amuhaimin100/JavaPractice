package practice5;

import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        //Hashtable can't contain null key, but HashMap can contain null key
        //Hashtable can't contain null value, but HashMap can contain null value
        //Hasmap is faster, Hashtable is slower
        //Hashmap is not thread safe and non synchronized, Hashtable is not thread safe and sychronized, that's why Hashtable is slower
        Hashtable<Integer, String> student= new Hashtable<>();
        student.put(32,"Jafar");
        student.put(53,"Sraboni");
        student.put(12,"David");
        student.put(null,"Abir");

        System.out.println(student);
    }
}
