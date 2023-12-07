package marksmgmtcode;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List<Student> students;

	public StudentManager() {
		students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		
		
		try {
			
		
		for (Student studentObject : students) {
			if (studentObject.getStudentId().equals(student.getStudentId())) {
				System.out.println("Student already exists.");
				return;
			}
		}
		students.add(student);
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to Add Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	public Student findStudent(String studentId) {
		try {
			
		for (Student student : students) {
			if (student.getStudentId().equals(studentId)) {
				return student;
			}
		}
		return null;
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to Find Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
	}

	public void updateStudent(String studentId, String newStudentName) {
		try {
		Student student = findStudent(studentId);
		if (student != null) {
			student.setStudentName(newStudentName);
		} else {
			System.out.println("Student not found.");
		}
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to update Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

	public void deleteStudent(String studentId) {
		try {
		Student student = findStudent(studentId);
		if (student != null) {
			students.remove(student);
			System.out.println("Student deleted successfully.");
		} else {
			System.out.println("Student not found.");
		}
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to delete Student"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

	public void updateStudentMarks(String studentId, double pfMarks, double dbmsMarks) {
		try {
		Student student = findStudent(studentId);
		if (student != null) {
			student.setProgFundamentals_Marks(pfMarks);
			student.setDbms_Marks(dbmsMarks);
		} else {
			System.out.println("Student not found.");
		}
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to Update Student Marks"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public List<Student> getStudents() {
		return students;
	}

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
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to get the Best Student In ProgrammingFundamentals"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		return topper;
	}

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
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code to get the Best Student In Database Management System"
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		return topper;
	}
}