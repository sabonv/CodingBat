package Starts;

import Map1.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by v.usov on 21.07.2016.
 */
public class Start_Map1 {
    public static Map maps = new HashMap<String, String>();


    public static void main(String[] args) {
/*
//Map-1 > mapBully
        Start_Map1.maps.put("b", "dirt");
        Start_Map1.maps.put("a", "candy");
        print(All_task_in_one.mapBully(Start_Map1.maps));

//Map-1 > mapShare
        Start_Map1.maps.put("b", "dirt");
        Start_Map1.maps.put("a", "candy");
        Start_Map1.maps.put("c", "ccy");
        Start_Map1.maps.put("d", "dddd");
        print(All_task_in_one.mapShare(Start_Map1.maps));

//Map-1 > mapAB
        Start_Map1.maps.put("b", "dirt");
        Start_Map1.maps.put("a", "candy");
        print(All_task_in_one.mapAB(Start_Map1.maps));
*/
//Map-1 > topping1
        Start_Map1.maps.put("b", "dirt");
        Start_Map1.maps.put("ice cream", "candy");
        print(All_task_in_one.topping1(Start_Map1.maps));

//Map-1 > topping2
        Start_Map1.maps.put("spinach", "dirt");
        Start_Map1.maps.put("ice cream", "candy");
        print(All_task_in_one.topping2(Start_Map1.maps));

//Map-1 > topping3
        Start_Map1.maps.put("potato", "dirt");
        Start_Map1.maps.put("salad", "candy");
        print(All_task_in_one.topping3(Start_Map1.maps));

    }

    public static void print (Map<String, String> mapp) {

        for(Map.Entry pair : mapp.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

        clear();

    }

    public static void clear (){
        for(Iterator<Map.Entry<String, String>> it = Start_Map1.maps.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            it.remove();
        }
        System.out.println("-MapS cleared");
        System.out.println("");
    }

}
