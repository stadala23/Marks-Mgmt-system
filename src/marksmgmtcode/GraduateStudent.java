package marksmgmtcode;

public class GraduateStudent extends Student {
	private String areaOfStudy;

	public GraduateStudent(String studentId, String studentName, String researchArea) {
		super(studentId, studentName);
		this.areaOfStudy = researchArea;
	}

	public String getAreaOfStudy() {
		return areaOfStudy;
	}

	public void setAreaOfStudy(String researchArea) {
		this.areaOfStudy = researchArea;
	}

	@Override
	public String toString() {
		return super.toString() + ",  Area Of Study: " + areaOfStudy;
	}
}