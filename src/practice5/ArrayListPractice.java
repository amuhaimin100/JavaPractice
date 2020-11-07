package practice5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {

        //elastic
        //size method

        ArrayList<String>listofCity =new ArrayList<>();


        listofCity.add("Queens");
        listofCity.add("Manhattan");
        listofCity.remove("Manhattan");
        listofCity.add("Jersey City");
        listofCity.add("Bronx");
        listofCity.remove(0);


        System.out.println(listofCity);
        System.out.println(listofCity.size());

        System.out.println(listofCity.get(0));

        for(int i=0; i<listofCity.size();i++){
            System.out.println(listofCity.get(i));
        }

        listofCity.add("DC");
        listofCity.add("VA");

        Iterator iterator= listofCity.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList<Integer>zipcode =new ArrayList<>();
        zipcode.add(76576);
        zipcode.add(11234);
        zipcode.add(45654);

        zipcode.clear();// this will clear the data
        System.out.println(zipcode);

        ArrayList<Object>everything= new ArrayList<>();
        everything.add("New York City");
        everything.add(898);
        everything.add(true);
        System.out.println(everything);

        ArrayList everything2= new ArrayList<>(); //works without <> datatype but not recommended
        everything2.add("New York City");
        everything2.add(898);
        everything2.add(true);
        System.out.println(everything2);
    }
}
