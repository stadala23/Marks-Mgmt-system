package marksmgmtcode;

/**
 * Represents a graduate student, extending the general Student class.
 * This class adds specific properties and methods relevant to graduate students.
 */
public class GraduateStudent extends Student {
    private String areaOfStudy;

    /**
     * Constructor for GraduateStudent.
     * @param studentId Unique identifier for the student.
     * @param studentName Name of the student.
     * @param researchArea Area of study or research focus for the graduate student.
     */
    public GraduateStudent(String studentId, String studentName, String researchArea) {
        super(studentId, studentName);
        this.areaOfStudy = researchArea;
    }

    // Getter for area of study
    public String getAreaOfStudy() {
        return areaOfStudy;
    }

    // Setter for area of study
    public void setAreaOfStudy(String researchArea) {
        this.areaOfStudy = researchArea;
    }

    /**
     * Overridden toString method to include area of study in the student's information.
     * @return String representation of the graduate student.
     */
    @Override
    public String toString() {
        return super.toString() + ",  Area Of Study: " + areaOfStudy;
    }
}