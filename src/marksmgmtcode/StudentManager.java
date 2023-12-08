package marksmgmtcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the student records for the Marks Management application. This class
 * handles operations such as adding, updating, and deleting student records.
 */
private class StudentManager {
	private List<Student> students;

	/**
	 * Constructor for StudentManager. Initializes a list to hold student records.
	 */
	public StudentManager() {
		students = new ArrayList<>();
	}

	/**
	 * Adds a student to the student list. Checks for duplicate entries based on
	 * student ID before adding.
	 * 
	 * @param student The student object to be added.
	 */
	public void addStudent(Student student) {

		try {

			for (Student studentObject : students) {
				if (studentObject.getStudentId().equals(student.getStudentId())) {
					System.out.println("Student already exists.");
					return;
				}
			}
			students.add(student);
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to Add Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * Finds a student in the list by their student ID.
	 * 
	 * @param studentId The ID of the student to find.
	 * @return The found Student object or null if not found.
	 */
	public Student findStudent(String studentId) {
		try {

			for (Student student : students) {
				if (student.getStudentId().equals(studentId)) {
					return student;
				}
			}
			return null;
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to Find Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

			return null;
		}
	}

	/**
	 * Updates the name of a student.
	 * 
	 * @param studentId      The ID of the student whose name is to be updated.
	 * @param newStudentName The new name of the student.
	 */
	public void updateStudent(String studentId, String newStudentName) {
		try {
			Student student = findStudent(studentId);
			if (student != null) {
				student.setStudentName(newStudentName);
			} else {
				System.out.println("Student not found.");
			}
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to update Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Deletes a student from the list based on student ID.
	 * 
	 * @param studentId The ID of the student to be deleted.
	 */
	public void deleteStudent(String studentId) {
		try {
			Student student = findStudent(studentId);
			if (student != null) {
				students.remove(student);
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("Student not found.");
			}
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to delete Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	/**
	 * Updates Marks for student based on student ID.
	 * 
	 * @param studentId The ID of the student for marks to be updated.
	 * @param pfMarks   Marks to be updated for Programming Fundamentals for the
	 *                  student.
	 * @param dbmsMarks Marks to be updated for DBMS for the student.
	 */

	public void updateStudentMarks(String studentId, double pfMarks, double dbmsMarks) {
		try {
			Student student = findStudent(studentId);
			if (student != null) {
				student.setProgFundamentals_Marks(pfMarks);
				student.setDbms_Marks(dbmsMarks);
			} else {
				System.out.println("Student not found.");
			}
		} catch (Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to Update Student Marks"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	// Getter Method for Getting the List
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Finds the Topper Student in Programming Fundamentals
	 * 
	 * 
	 */
	public Student getBestStudentInProgrammingFundamentals() {
		Student topper = null;
		double highestMarks = 0.0;

		try {
			for (Student student : students) {
				if (student.getProgFundamentals_Marks() > highestMarks) {
					highestMarks = student.getProgFundamentals_Marks();
					topper = student;
				}
			}
		} catch (Exception e) {
			System.out.println(
					"There seems to be Some Exception Occurred in the code to get the Best Student In ProgrammingFundamentals"
							+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		return topper;
	}

	/**
	 * Finds the Topper Student in Database Management Systems
	 * 
	 * 
	 */
	public Student getBestStudentInDatabaseManagementSystem() {
		Student topper = null;
		double highestMarks = 0.0;
		try {
			for (Student student : students) {
				if (student.getDbms_Marks() > highestMarks) {
					highestMarks = student.getDbms_Marks();
					topper = student;
				}
			}
		} catch (Exception e) {
			System.out.println(
					"There seems to be Some Exception Occurred in the code to get the Best Student In Database Management System"
							+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		return topper;
	}
}