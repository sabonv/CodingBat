package Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/**
 * Created by v.usov on 21.07.2016.
 */
public class All_task_in_one {

    public static Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a")&&map.containsKey("b")) map.put("ab", (map.get("a")+map.get("b")));
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")) map.put("ice cream", "cherry");
        map.put("bread", "butter");
        return map;
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if(map.get("ice cream")!=null) map.put("yogurt", map.get("ice cream"));
        if(map.get("spinach")!=null) map.put("spinach", "nuts");
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if(map.get("potato")!=null) map.put("fries", map.get("potato"));
        if(map.get("salad")!=null) map.put("spinach", map.get("salad"));
        return map;
    }

}
