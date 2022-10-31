import java.util.HashSet;

public class Program_8_IntegerObjects {

    //Use a Hashset  that stores integer objects. Store the number 4, 7 and 8 to sets. show which number 1 and
    // 10 are in set.(Hint: use for loop and if else)

    public static void main(String[] args) {
        HashSet<Integer>number=new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);
        for (int i=0 ; i<=10; i++){
            if(number.contains(i)){
                System.out.println(i+ "  Number is set between 1 and 10");
            }
        }
    }
}
