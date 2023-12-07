package marksmgmtcode;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private StudentManager studentManager;
    private Scanner scanner;

    public Menu() {
        studentManager = new StudentManager();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
    	try {
        while (true) {
            System.out.println("1. Add Undergraduate Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Update Student Name");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Students");
            System.out.println("7. Exit");
            System.out.println("8. Display Best Student in Programming Fundamentals");
            System.out.println("9. Display Best Student in Database Management System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addUndergraduateStudent();
                    break;
                case 2:
                    addGraduateStudent();
                    break;
                case 3:
                    updateStudentName();
                    break;
                case 4:
                    updateStudentMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    displayStudents();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                case 8:
                    displayBestStudentInProgrammingFundamentals();
                    break;
                case 9:
                    displayBestStudentInDatabaseManagementSystem();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    catch(Exception e) {
    	System.out.println("There seems to be Some Exception Occurred in the code to displayMenu"
				+ " The Exception Message and Stack Trace is as Follows. Pls Check");
		System.out.println(e.getMessage());
		e.printStackTrace();
    }
    }

    private void addUndergraduateStudent() {
    	try {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        UndergraduateStudent student = new UndergraduateStudent(id, name, major);
        studentManager.addStudent(student);
        System.out.println("Undergraduate Student added successfully.");
    	}
    	catch(Exception e) {
    		System.out.println("There seems to be Some Exception Occurred in the code to addUndergraduateStudent in Menu"
    				+ " The Exception Message and Stack Trace is as Follows. Pls Check");
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    		
    	}
    }

    private void addGraduateStudent() {
    	try {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Research Area: ");
        String researchArea = scanner.nextLine();
        GraduateStudent student = new GraduateStudent(id, name, researchArea);
        studentManager.addStudent(student);
        System.out.println("Graduate Student added successfully.");
    	}
    	catch(Exception e) {
    		System.out.println("There seems to be Some Exception Occurred in the code to addGraduateStudent in Menu"
    				+ " The Exception Message and Stack Trace is as Follows. Pls Check");
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    		
    	}
    }

    private void updateStudentName() {
    	try {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        studentManager.updateStudent(id, newName);
        System.out.println("Student name updated successfully.");
    	}
    	catch(Exception e) {
    		System.out.println("There seems to be Some Exception Occurred in the code to updateStudentName in Menu"
    				+ " The Exception Message and Stack Trace is as Follows. Pls Check");
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    		
    	}
    }

    private void updateStudentMarks() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Programming Fundamentals Marks: ");
        double pfMarks = scanner.nextDouble();
        System.out.print("Enter Database Management System Marks: ");
        double dbmsMarks = scanner.nextDouble();
        studentManager.updateStudentMarks(id, pfMarks, dbmsMarks);
        System.out.println("Student marks updated successfully.");
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        studentManager.deleteStudent(id);
        System.out.println("Student deleted successfully.");
    }

    private void displayStudents() {
        List<Student> students = studentManager.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void displayBestStudentInProgrammingFundamentals() {
        Student bestStudent = studentManager.getBestStudentInProgrammingFundamentals();
        if (bestStudent != null) {
            System.out.println("Best Student in Programming Fundamentals: " + bestStudent);
        } else {
            System.out.println("No student data available.");
        }
    }

    private void displayBestStudentInDatabaseManagementSystem() {
        Student bestStudent = studentManager.getBestStudentInDatabaseManagementSystem();
        if (bestStudent != null) {
            System.out.println("Best Student in Database Management System: " + bestStudent);
        } else {
            System.out.println("No student data available.");
        }
    }
}
