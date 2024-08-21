import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int[] marks = new int[6];

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public double calculatePercentage() {
        double totalMarks = calculateTotalMarks();
        return (totalMarks / (6 * 150)) * 100;
    }

    public void printMarksheet() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subject\t\tMax Marks\tObtained Marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "\t150\t\t" + marks[i]);
        }
        System.out.println("Total Marks Obtained: " + calculateTotalMarks());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + determineStatus());
    }

    public String determineStatus() {
        int failedSubjects = 0;
        for (int mark : marks) {
            if (mark < 60) {
                failedSubjects++;
            }
        }
        if (failedSubjects > 3) {
            return "Fail";
        } else if (failedSubjects == 0) {
            return "Pass";
        } else {
            return "ATKT";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            int[] marks = new int[6];
            System.out.println("Enter marks for 6 subjects:");
            for (int j = 0; j < 6; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }

            Student student = new Student(name, rollNumber, marks);
            student.printMarksheet();
        }
        scanner.close();
    }
}
