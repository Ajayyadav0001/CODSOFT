import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean repeat = true;
        while (repeat) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student name -> ");
            String name = sc.nextLine();

            System.out.print("Number of subject = ");
            int NumOfSub = sc.nextInt();
            System.out.println("Enter the marks of " + NumOfSub + " subjects::");

            // To store the values of five subjects
            int sumOfMarks = 0;
            // int numberOfSubject=5;
            for (int i = 0; i < NumOfSub; i++) {
                System.out.print("Enter marks for Subject_" + (i + 1) + " = ");
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.print("! Invalid entry\n");
                    i--;

                }
                sumOfMarks = sumOfMarks + marks;
            }

            float average;
            float percentage;
            char grade;

            // Calculate total, average and percentage
            average = (sumOfMarks / 5);
            percentage = (float) ((sumOfMarks / 500.0) * 100);

            // It will produce the final output
            System.out.println("The Total marks obtained by student = " + sumOfMarks);
            System.out.println("The Average marks = " + average);
            System.out.println("The Percentage    = " + percentage + "%");

            // It will calculate the Grade
            if (average >= 80)
                grade = 'A';
            else if (average >= 70 && average < 80)
                grade = 'B';
            else if (average >= 60 && average < 70)
                grade = 'C';
            else if (average >= 50 && average < 60)
                grade = 'D';
            else
                grade = 'E';

            System.out.println("The Grade         = '" + grade + "'");

            System.out.println("Do you want to calculate another response again? (Y/N) ");
            String Again = sc.next();
            System.out.println("------------------------------------------------------\n");

            repeat = Again.equalsIgnoreCase("y");
        }
    }
}
