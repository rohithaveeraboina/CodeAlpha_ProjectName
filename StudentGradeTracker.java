import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Grade");
            System.out.println("2. View All Grades");
            System.out.println("3. Show Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter grade (0-100): ");
                    int grade = sc.nextInt();
                    if (grade >= 0 && grade <= 100) {
                        grades.add(grade);
                        System.out.println("Grade added successfully!");
                    } else {
                        System.out.println("Invalid grade! Enter between 0-100.");
                    }
                    break;

                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("No grades entered yet.");
                    } else {
                        System.out.println("Student Grades: " + grades);
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available for statistics.");
                    } else {
                        int sum = 0, highest = grades.get(0), lowest = grades.get(0);
                        for (int g : grades) {
                            sum += g;
                            if (g > highest) highest = g;
                            if (g < lowest) lowest = g;
                        }
                        double average = (double) sum / grades.size();
                        System.out.println("----- Statistics -----");
                        System.out.println("Total Students: " + grades.size());
                        System.out.println("Average Grade: " + average);
                        System.out.println("Highest Grade: " + highest);
                        System.out.println("Lowest Grade: " + lowest);
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}