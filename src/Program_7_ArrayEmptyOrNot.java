import java.util.ArrayList;

public class Program_7_ArrayEmptyOrNot {
    //Write a java program to test an array list is empty or not. Define array list with underground tube names

    public static void main(String[] args) {
        ArrayList<String>  tubename = new ArrayList();
        tubename.add("Bakerloo");
        tubename.add("Central");
        tubename.add("Circle");
        tubename.add("Jubliee");
        tubename.add("Piccadilly");
        tubename.add("Victoria");
        tubename.add("Waterloo");
        tubename.add("Metropolitan");

          System.out.println("Original array list: " + tubename);
          System.out.println("Checking the above array list is empty or not! "+tubename.isEmpty());
        tubename.removeAll(tubename);
          System.out.println("Array list after remove all elements "+tubename);
          System.out.println("Checking the above array list is empty or not! "+tubename.isEmpty());
}
}


