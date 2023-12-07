package marksmgmtcode;

public class Student {
    protected String studentId;
    protected String studentName;
    private double programmingFundamentalsMarks;
    private double databaseManagementSystemMarks;

    public Student(String id, String name) {
        this.studentId = id;
        this.studentName = name;
        this.programmingFundamentalsMarks = 0.0;
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

    public double getProgrammingFundamentalsMarks() {
        return programmingFundamentalsMarks;
    }

    public void setProgrammingFundamentalsMarks(double programmingFundamentalsMarks) {
        this.programmingFundamentalsMarks = programmingFundamentalsMarks;
    }

    public double getDatabaseManagementSystemMarks() {
        return databaseManagementSystemMarks;
    }

    public void setDatabaseManagementSystemMarks(double databaseManagementSystemMarks) {
        this.databaseManagementSystemMarks = databaseManagementSystemMarks;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName + ", PF Marks: " + programmingFundamentalsMarks + ", DBMS Marks: "
                + databaseManagementSystemMarks;
    }
}