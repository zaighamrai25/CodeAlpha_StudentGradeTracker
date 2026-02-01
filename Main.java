import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {
            System.out.println("\n=== Student Grade Tracker ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Show Average Marks");
            System.out.println("4. Show Highest Marks");
            System.out.println("5. Show Lowest Marks");
            System.out.println("6. Exit");
            System.out.println("7. Show Summary Report");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, marks);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.printf("Average Marks: %.2f\n", manager.averageMarks());
                    break;

                case 4:
                    System.out.printf("Highest Marks: %.2f\n", manager.highestMarks());
                    break;

                case 5:
                    System.out.printf("Lowest Marks: %.2f\n", manager.lowestMarks());
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                case 7:
                    manager.summaryReport();
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}