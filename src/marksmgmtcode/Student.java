package marksmgmtcode;

public class Student {
    protected String studentId;
    protected String studentName;
    private double progFundamentals_Marks;
    private double dbms_Marks;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.progFundamentals_Marks = 0.0;
        this.dbms_Marks = 0.0;
    }

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

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName + ", PF Marks: " + progFundamentals_Marks + ", DBMS Marks: "
                + dbms_Marks;
    }
}