import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add new student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nID\tName\tMarks");
        for (Student s : students) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getMarks());
        }
    }

    // Average marks
    public double averageMarks() {
        if (students.isEmpty()) return 0;

        double total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }
        return total / students.size();
    }

    // Highest marks
    public double highestMarks() {
        if (students.isEmpty()) return 0;

        double max = students.get(0).getMarks();
        for (Student s : students) {
            if (s.getMarks() > max) {
                max = s.getMarks();
            }
        }
        return max;
    }

    // Lowest marks
    public double lowestMarks() {
        if (students.isEmpty()) return 0;

        double min = students.get(0).getMarks();
        for (Student s : students) {
            if (s.getMarks() < min) {
                min = s.getMarks();
            }
        }
        return min;
    }

    // Summary Report - Combined
    public void summaryReport() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n=== Student Summary Report ===");
        System.out.println("ID\tName\tMarks");
        for (Student s : students) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getMarks());
        }

        System.out.println("-------------------------------");
        System.out.printf("Average Marks: %.2f\n", averageMarks());
        System.out.printf("Highest Marks: %.2f\n", highestMarks());
        System.out.printf("Lowest Marks: %.2f\n", lowestMarks());
        System.out.println("-------------------------------\n");
    }
}
