import java.util.Scanner;

public class Program_2_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name    \t\t:\t");
        String name = scanner.next();
        System.out.println("Enter Roll Number  \t\t:\t");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter Marks of subject Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject Science \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject English \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100 / 300);
        String result = calculateResult(mathsMarks, englishMarks, scienceMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarksSheet(name, rollNumber, mathsMarks, englishMarks, scienceMarks, total, percentage, result, grade);
        scanner.close();
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        while (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        }
        {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    public static void printTheMarksSheet(String name, int rollNum, int mathMarks, int scienceMarks,
                                          int englishMarks, double total, double percentage, String result,
                                          String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|_________|");
        System.out.println("| Name:" + name + "                |\n");
        System.out.println("| Roll No:" + rollNum + "                |\n");
        System.out.println("|_________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|_________|");
        System.out.println("| Math:" + mathMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|_________|");
        System.out.println("| Total:" + total + "              |\n");
        System.out.println("|_________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |\n");
        System.out.println("|____________________________|\n");

    }
}