package marksmgmtcode;

public class UndergraduateStudent extends Student {
	private String fieldOfStudy;

	public UndergraduateStudent(String studentId, String studentName, String fieldOfStudy) {
		super(studentId, studentName);
		this.fieldOfStudy = fieldOfStudy;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	@Override
	public String toString() {
		return super.toString() + ", fieldOfStudy: " + fieldOfStudy;
	}
}