package marksmgmtcode;

/**
 * Represents an undergraduate student, extending the Student class. This class
 * includes specific properties relevant to undergraduate students, such as
 * field of study.
 */
public class UndergraduateStudent extends Student {
	private String fieldOfStudy;

	/**
	 * Constructor for UndergraduateStudent.
	 * 
	 * @param studentId    Unique identifier for the student.
	 * @param studentName  Name of the student.
	 * @param fieldOfStudy Field of study for the undergraduate student.
	 */
	public UndergraduateStudent(String studentId, String studentName, String fieldOfStudy) {
		super(studentId, studentName);
		this.fieldOfStudy = fieldOfStudy;
	}

	// Getter and setter for fieldOfStudy with appropriate comments...

	/**
	 * Overridden toString method to include field of study in the student's
	 * information.
	 * 
	 * @return String representation of the undergraduate student.
	 */
	@Override
	public String toString() {
		return super.toString() + ", fieldOfStudy: " + fieldOfStudy;
	}
}