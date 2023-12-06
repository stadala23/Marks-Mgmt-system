package marksmgmtcode;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List<Student> students;

	public StudentManager() {
		students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		for (Student s : students) {
			if (s.getId().equals(student.getId())) {
				System.out.println("Student already exists.");
				return;
			}
		}
		students.add(student);
	}

	public Student findStudent(String id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}

	public void updateStudent(String id, String newName) {
		Student student = findStudent(id);
		if (student != null) {
			student.setName(newName);
		} else {
			System.out.println("Student not found.");
		}
	}

	public void deleteStudent(String id) {
		Student student = findStudent(id);
		if (student != null) {
			students.remove(student);
			System.out.println("Student deleted successfully.");
		} else {
			System.out.println("Student not found.");
		}
	}

	public void updateStudentMarks(String id, double pfMarks, double dbmsMarks) {
		Student student = findStudent(id);
		if (student != null) {
			student.setProgrammingFundamentalsMarks(pfMarks);
			student.setDatabaseManagementSystemMarks(dbmsMarks);
		} else {
			System.out.println("Student not found.");
		}
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getBestStudentInProgrammingFundamentals() {
		Student bestStudent = null;
		double highestMarks = 0.0;

		for (Student student : students) {
			if (student.getProgrammingFundamentalsMarks() > highestMarks) {
				highestMarks = student.getProgrammingFundamentalsMarks();
				bestStudent = student;
			}
		}
		return bestStudent;
	}

	public Student getBestStudentInDatabaseManagementSystem() {
		Student bestStudent = null;
		double highestMarks = 0.0;

		for (Student student : students) {
			if (student.getDatabaseManagementSystemMarks() > highestMarks) {
				highestMarks = student.getDatabaseManagementSystemMarks();
				bestStudent = student;
			}
		}
		return bestStudent;
	}
}
