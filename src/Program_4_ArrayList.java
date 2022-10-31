import java.util.ArrayList;

public class Program_4_ArrayList {

    /*Write a Java program to create a new array list, add some colours (string) and
    printout the collection using for each loop*/

    public static void main(String[] args) {

        ArrayList<String> colourlist = new ArrayList();
        colourlist.add("Orange");
        colourlist.add("Red");
        colourlist.add("Blue");
        colourlist.add("Black");
        colourlist.add("Yellow");
        colourlist.add("Pruple");
        colourlist.add("White");
        colourlist.add("Green");
        colourlist.add("Brown");
        colourlist.add("Golden");
        colourlist.add("Pink");

        for ( String collection : colourlist){
            System.out.println(collection);
        }

    }

}
