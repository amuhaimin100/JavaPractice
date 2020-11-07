package practice5;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<String> cityOfUSA= new ArrayList<>();
        cityOfUSA.add("NYC");
        cityOfUSA.add("Jersey City");
        cityOfUSA.add("Dallas");

        ArrayList<String> cityOfCanada= new ArrayList<>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Ottowa");
        cityOfCanada.add("Montreal");

        ArrayList<ArrayList<String>> world = new ArrayList<>();
        world.add(cityOfCanada);
        world.add(cityOfUSA);

        System.out.println(world);
    }
}
