package marksmgmtcode;

public class UndergraduateStudent extends Student {
	private String major;

	public UndergraduateStudent(String id, String name, String major) {
		super(id, name);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + ", Major: " + major;
	}
}
