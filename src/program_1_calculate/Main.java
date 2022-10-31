package program_1_calculate;


import java.util.Scanner;

public class Main extends Calculator {
    static char userAns;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
            System.out.println("Enter first number: ");
            obj.a = scanner.nextInt();
            System.out.println("Enter second number: ");
            obj.b = scanner.nextInt();
            System.out.println("Enter one of the symbol +, -, *, / :");
            obj.symbol=scanner.next().charAt(0);
            obj.calculateResult(obj.a, obj.b, obj.symbol);
            System.out.println("would you like to do anymore calculation Please enter: Y or N");
            char userAns = scanner.next().toLowerCase().charAt(0);

                while (userAns == 'y') {
                System.out.println("Enter first number: ");
                obj.a = scanner.nextInt();
                System.out.println("Enter second number: ");
                obj.b = scanner.nextInt();
                System.out.println("Enter one of the symbol +, -, *, / :");
                obj.symbol = scanner.next().charAt(0);
                obj.calculateResult(obj.a, obj.b, obj.symbol);
                System.out.println("would you like to do anymore calculation Please enter: Y or N");
                userAns = scanner.next().toLowerCase().charAt(0);
            }

            while (userAns == 'N');
        {
            System.out.println("Thank You");
            System.exit(0);
    }}}
