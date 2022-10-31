import java.util.ArrayList;
import java.util.ListIterator;

public class Program_5_ArraysElements {
 /*Write a java program to iterate through all elements in an array list using iterator*/

    public static void main(String[] args) {
        ArrayList<String>languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Java Script");
        languages.add("Python");
        System.out.println("Arraylist: "+ languages);

        ListIterator<String>iterator=languages.listIterator();
        System.out.println("Iterating over Arraylist: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ ",");
        }
    }

}
