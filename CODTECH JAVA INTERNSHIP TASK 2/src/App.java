import java.util.Scanner;





public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();


        Student student = new Student(studentName, numSubjects);


        student.inputGrades();
        student.displayReport();

        scanner.close();
    }
}



class Student {
    private String name;
    private double[] grades;
    private String[] subjects;
    private int numSubjects;


    public Student(String name, int numSubjects) {
        this.name = name;
        this.numSubjects = numSubjects;
        grades = new double[numSubjects];
        subjects = new String[numSubjects];
    }


    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grades for " + numSubjects + " subjects:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name #" + (i + 1) + ": ");
            subjects[i] = scanner.next();

            System.out.print("Enter the grade for " + subjects[i] + " (0-100): ");
            grades[i] = scanner.nextDouble();
            

            if (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
                i--; 
            }
        }
    }


    public double calculateAverage() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / numSubjects;
    }


    public char getLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }


    public double calculateGPA(double averageGrade) {
        if (averageGrade >= 90) {
            return 4.0;
        } else if (averageGrade >= 80) {
            return 3.0;
        } else if (averageGrade >= 70) {
            return 2.0;
        } else if (averageGrade >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }


    public void displayReport() {
        System.out.println("\nReport for Student: " + name);
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + grades[i]);
        }
        double averageGrade = calculateAverage();
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Overall Letter Grade: " + getLetterGrade(averageGrade));
        System.out.println("GPA: " + calculateGPA(averageGrade));
    }
}


