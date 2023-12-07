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

	private void addUndergraduateStudent() {
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

	private void addGraduateStudent() {
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

	private void updateStudentName() {
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

	private void updateStudentMarks() {
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

	private void deleteStudent() {
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

	private void displayStudents() {
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

	private void displayBestStudentInProgrammingFundamentals() {
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

	private void displayBestStudentInDatabaseManagementSystem() {
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