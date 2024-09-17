# CODTECH-IT-SOLUTIONS-JAVA-INTERNSHIP-TASK-2
Develop a Java program to track and manage student grades. The program should allow the user to input grades for different subjects or assignments, calculate the average grade, and display the overall grade along with any additional information (such as letter grade or GPA).

#Student Grade Management System
This Java program is designed to track and manage student grades. The program allows the user to input grades for different subjects, calculate the average grade, display the overall grade, and provide additional information such as letter grade and GPA.

#Features
Input Grades: Users can input the grades for multiple subjects.
Average Grade Calculation: The program computes the average of all the entered grades.
Letter Grade Assignment: Based on the average, the program assigns a letter grade (A, B, C, D, F).
GPA Calculation: It calculates the GPA on a 4.0 scale based on the average grade.
Error Handling: Ensures grades are within the valid range (0-100).

#How to Use
Clone the Repository: Download the code to your local machine.

bash
git clone [https://github.com/your-repo/student-grade-management.git](https://github.com/Rup-2004/CODTECH-IT-SOLUTIONS-JAVA-INTERNSHIP-TASK-2)
cd CODTECH-IT-SOLUTIONS-JAVA-INTERNSHIP-TASK-2
Compile and Run the Program: Compile the Java program and run it using a Java compiler (e.g., javac and java commands).

bash
javac App.java
java App
Follow the Prompts: The program will ask you to:

Enter the student's name.
Enter the number of subjects.
Enter the subject names and corresponding grades.


Example input:

Enter the student's name: Alice
Enter the number of subjects: 3
Enter subject name #1: Math
Enter the grade for Math (0-100): 85
Enter subject name #2: Physics
Enter the grade for Physics (0-100): 90
Enter subject name #3: English
Enter the grade for English (0-100): 95
View the Results: After providing all the inputs, the program will display the summary of grades, the average grade, letter grade, and GPA.

Example output:

Report for Student: Alice
Math: 85.0
Physics: 90.0
English: 95.0
Average Grade: 90.0
Overall Letter Grade: A
GPA: 4.0

#Customization
Number of Subjects: The program allows the user to set the number of subjects for each student during input.
Grade Boundaries: The letter grade and GPA calculation are based on predefined ranges. You can modify these ranges in the methods getLetterGrade() and calculateGPA() in the Student class.

#Prerequisites
Java Development Kit (JDK): Ensure that Java is installed on your system. You can download it from the official website.

#Project Structure
Student.java: The main class representing a student. It handles the grade inputs, calculations, and report generation.
App.java: The main class that initiates the program, creates the student object, and interacts with the user.

#Author
Rupayan Ghosh
