import java.util.ArrayList;

public class Program_6_SpecifiedIndex {

    //Write a java program to retrieve an element (at a specified index ) from a given array list

    public static void main(String[] args) {
        ArrayList<String> colourlist = new ArrayList();
        colourlist.add("Orange");
        colourlist.add("Red");
        colourlist.add("Blue");
        colourlist.add("Black");
        colourlist.add("Yellow");
        colourlist.add("White");
        colourlist.add("Green");
        colourlist.add("Brown");
        System.out.println("The index you select is == "+colourlist.get(3));
        System.out.println("The index you select is == "+colourlist.get(6));
    }
}
