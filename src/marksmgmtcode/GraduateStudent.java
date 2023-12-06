package marksmgmtcode;

public class GraduateStudent extends Student {
	private String researchArea;

	public GraduateStudent(String id, String name, String researchArea) {
		super(id, name);
		this.researchArea = researchArea;
	}

	public String getResearchArea() {
		return researchArea;
	}

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	@Override
	public String toString() {
		return super.toString() + ", Research Area: " + researchArea;
	}
}