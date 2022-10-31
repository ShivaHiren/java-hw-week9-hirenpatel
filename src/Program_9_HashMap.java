import java.util.HashMap;
import java.util.Map;

public class Program_9_HashMap {

    /*Create a HashMap object called people that will store String keys and Integer
    values: And use for each loop to iterate the value from map.*/

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap();
        people.put("Nauman" , 1);
        people.put("Hiren" , 2);
        people.put("Manisha" , 3);
        people.put("Krupa" , 4);
        people.put("Siddhi" , 5);
        people.put("Harshid" , 6);
        people.put("Kishan" , 7);

         //   for(Object keyValue: people.entrySet()){

        for (Map.Entry<String, Integer> keyValue : people.entrySet()) {
            System.out.println(keyValue+ " ");

        }}}