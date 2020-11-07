package practice5;

import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {

        HashMap<String,Integer> cityAndZipofCanada= new HashMap<>();
        cityAndZipofCanada.put("Toronto", 23434);
        cityAndZipofCanada.put("Montreal", 45455);
        cityAndZipofCanada.put("Ottowa", 45666);


        HashMap<String, Integer>cityAndZipofUSA= new HashMap<>();
        cityAndZipofUSA.put("New York City", 11001);
        cityAndZipofUSA.put("Dallas", 73456);
        cityAndZipofUSA.put("Denver", 43455);

        //use key= usa, canada---String
        //value= Hashmap of String and Integer

        HashMap<String, HashMap<String, Integer>> map= new HashMap();
        map.put("usa", cityAndZipofUSA);
        map.put("canada", cityAndZipofCanada);
        System.out.println(map);
    }
}
