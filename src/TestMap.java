import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String ,Integer> hashMap=new HashMap<>();
        hashMap.put("le",10);
        hashMap.put("van",50);
        hashMap.put("huan",40);
        hashMap.put("son",20);
        System.out.println("display all");
        System.out.println(hashMap+ "\n " );

        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("display all");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("smith",30);
        linkedHashMap.put("jame",40);
        linkedHashMap.put("luis",50);
        linkedHashMap.put("cook",60);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("smith"));


    }


}
