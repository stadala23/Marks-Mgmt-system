package marksmgmtcode;

/**
 * Represents a student in the Marks Management application. This class holds
 * basic student information and their marks in specific courses.
 */
public class Student {
	protected String studentId;
	protected String studentName;
	private double progFundamentals_Marks;
	private double dbms_Marks;

	/**
	 * Constructor for the Student class. Initializes a new student with default
	 * marks set to 0.0.
	 * 
	 * @param studentId   Unique identifier for the student.
	 * @param studentName Name of the student.
	 */
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.progFundamentals_Marks = 0.0;
		this.dbms_Marks = 0.0;
	}

	// Getter and setter methods for Private and Protected Variables STARTS
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getProgFundamentals_Marks() {
		return progFundamentals_Marks;
	}

	public void setProgFundamentals_Marks(double progFundamentals_Marks) {
		this.progFundamentals_Marks = progFundamentals_Marks;
	}

	public double getDbms_Marks() {
		return dbms_Marks;
	}

	public void setDbms_Marks(double dbms_Marks) {
		this.dbms_Marks = dbms_Marks;
	}

	// Getter and setter methods for Private and Protected Variables ENDS

	/**
	 * Provides a string representation of the student's information. Includes
	 * student ID, name, and marks in Programming Fundamentals and DBMS.
	 * 
	 * @return Formatted string with student details.
	 */
	@Override
	public String toString() {
		return "ID: " + studentId + ", Name: " + studentName + ", PF Marks: " + progFundamentals_Marks
				+ ", DBMS Marks: " + dbms_Marks;
	}
}