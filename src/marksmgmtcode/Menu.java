package marksmgmtcode;

import java.util.List;
import java.util.Scanner;

/**
 * Menu class for the Marks Management application. This class provides the user
 * interface for managing student records, offering functionalities like adding,
 * updating, and deleting students.
 */
 class Menu {
	private StudentManager studentManager;
	private Scanner scanner;

	/**
	 * Constructor for Menu class. Initializes the StudentManager and Scanner
	 * instances.
	 */
	public Menu() {
		studentManager = new StudentManager();
		scanner = new Scanner(System.in);
	}

	/**
	 * Displays the main menu with various options and handles user input. The menu
	 * offers functionalities like adding, updating, and displaying student records.
	 */
	public void displayMenu() {
		// Menu implementation with try-catch for exception handling
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

				int selectedChoice = scanner.nextInt();
				scanner.nextLine();

				switch (selectedChoice) {
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
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to displayMenu"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Adds a new undergraduate student record. This method prompts the user for
	 * student details and adds the record to the system.
	 */
	private void addUndergraduateStudent() {
		// Implementation for adding an undergraduate student
		try {
			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			System.out.print("Enter Student Name: ");
			String studentName = scanner.nextLine();
			System.out.print("Enter Field Of Study: ");
			String fieldOfStudy = scanner.nextLine();
			UndergraduateStudent underGradStudent = new UndergraduateStudent(studentId, studentName, fieldOfStudy);
			studentManager.addStudent(underGradStudent);
			System.out.println("Undergraduate Student added successfully.");
		} catch (Exception e) {
			System.out
					.println("There seems to be Some Exception Occurred in the code to addUndergraduateStudent in Menu"
							+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Adds a new graduate student record. This method prompts the user for student
	 * details, including their area of study, and adds the record.
	 */
	private void addGraduateStudent() {
		// Implementation for adding an graduate student
		try {
			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			System.out.print("Enter Student Name: ");
			String studentName = scanner.nextLine();
			System.out.print("Enter Area of Study: ");
			String areaOfStudy = scanner.nextLine();
			GraduateStudent gradStudent = new GraduateStudent(studentId, studentName, areaOfStudy);
			studentManager.addStudent(gradStudent);
			System.out.println("Graduate Student added successfully.");
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to addGraduateStudent in Menu"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Updates the name of an existing student. This method asks for the student ID
	 * and the new name, and updates the record accordingly.
	 */
	private void updateStudentName() {
		// Implementation for updating a student's name
		try {
			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			System.out.print("Enter New Student Name: ");
			String newStudentName = scanner.nextLine();
			studentManager.updateStudent(studentId, newStudentName);
			System.out.println("Student name updated successfully.");
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to updateStudentName in Menu"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Updates the marks of an existing student. This method allows modification of
	 * a student's marks in different subjects.
	 */
	private void updateStudentMarks() {
		// Implementation for updating a student's marks
		try {

			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			System.out.print("Enter Programming Fundamentals Marks: ");
			double progFundamentals_Marks = scanner.nextDouble();
			System.out.print("Enter Database Management System Marks: ");
			double dbms_Marks = scanner.nextDouble();
			studentManager.updateStudentMarks(studentId, progFundamentals_Marks, dbms_Marks);
			System.out.println("Student marks updated successfully.");
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to updateStudentMarks in Menu"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Deletes a student record from the system. This method requires the student ID
	 * for deletion.
	 */
	private void deleteStudent() {
		// Implementation for deleting a student record
		try {
			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			studentManager.deleteStudent(studentId);
			System.out.println("Student deleted successfully.");
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to deleteStudent in Menu"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Displays all student records from the system.
	 */
	private void displayStudents() {
		// Implementation for Displaying all student records
		try {

			List<Student> allStudents = studentManager.getStudents();
			for (Student student : allStudents) {
				System.out.println(student);
			}
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to displayStudents in Menu"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Displays the Best student of Programming Fundamentals Class from the system.
	 */
	private void displayBestStudentInProgrammingFundamentals() {

		// Implementation for Displaying Best student of Programming Fundamentals Class
		try {

			Student topper_ProgFundamentals = studentManager.getBestStudentInProgrammingFundamentals();
			if (topper_ProgFundamentals != null) {
				System.out.println("Best Student in Programming Fundamentals: " + topper_ProgFundamentals);
			} else {
				System.out.println("No student data available.");
			}
		} catch (Exception e) {
			System.out.println(
					"There seems to be Some Exception Occurred in the code to displayBestStudentInProgrammingFundamentals in Menu"
							+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Displays the Best student of Database Management System Class from the
	 * system.
	 */
	private void displayBestStudentInDatabaseManagementSystem() {

		// Implementation for Displaying Best student of Database Management System
		// Class
		try {

			Student topper_Dbms = studentManager.getBestStudentInDatabaseManagementSystem();
			if (topper_Dbms != null) {
				System.out.println("Best Student in Database Management System: " + topper_Dbms);
			} else {
				System.out.println("No student data available.");
			}
		} catch (Exception e) {
			System.out.println(
					"There seems to be Some Exception Occurred in the code to displayBestStudentInDatabaseManagementSystem in Menu"
							+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}
}