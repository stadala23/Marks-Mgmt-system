package marksmgmtcode;

public class Student {
    protected String studentId;
    protected String studentName;
    private double progFundamentals_Marks;
    private double databaseManagementSystemMarks;

    public Student(String id, String name) {
        this.studentId = id;
        this.studentName = name;
        this.progFundamentals_Marks = 0.0;
        this.databaseManagementSystemMarks = 0.0;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String id) {
        this.studentId = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public double getProgFundamentals_Marks() {
        return progFundamentals_Marks;
    }

    public void setProgFundamentals_Marks(double progFundamentals_Marks) {
        this.progFundamentals_Marks = progFundamentals_Marks;
    }

    public double getDatabaseManagementSystemMarks() {
        return databaseManagementSystemMarks;
    }

    public void setDatabaseManagementSystemMarks(double databaseManagementSystemMarks) {
        this.databaseManagementSystemMarks = databaseManagementSystemMarks;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName + ", PF Marks: " + progFundamentals_Marks + ", DBMS Marks: "
                + databaseManagementSystemMarks;
    }
}