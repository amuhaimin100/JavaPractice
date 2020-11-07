package practice5;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        //key-value

        HashMap<Integer, String> studentInformation = new HashMap<>();

        //Hashtable can't contain null key, but HashMap can contain null key
        //Hashtable can't contain null value, but HashMap can contain null value
        //Hasmap is faster, Hashtable is slower
        //Hashmap is not thread safe and non synchronized, Hashtable is not thread safe and sychronized, that's why Hashtable is slower

        studentInformation.put(123,"Nusrut");
        studentInformation.put(234,"Michael");
        studentInformation.put(345, "David");
        studentInformation.put(null,"Jafor");

        System.out.println(studentInformation.get(234)); //ask for the key, get the value attached to it

        HashMap<String,Integer> locationInformation = new HashMap<>();

        locationInformation.put("Rego park", 11456);


        System.out.println(locationInformation.get("Rego Park"));

        System.out.println(locationInformation);
        System.out.println(studentInformation);

        System.out.println(studentInformation.size());

        System.out.println(studentInformation.containsKey(345));

        System.out.println(studentInformation.containsValue("David"));



    }


}
