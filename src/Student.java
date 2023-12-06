package marksmgmtcode;

public class Student {
    protected String id;
    protected String name;
    private double programmingFundamentalsMarks;
    private double databaseManagementSystemMarks;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.programmingFundamentalsMarks = 0.0;
        this.databaseManagementSystemMarks = 0.0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "ID: " + id + ", Name: " + name + ", PF Marks: " + programmingFundamentalsMarks + ", DBMS Marks: "
                + databaseManagementSystemMarks;
    }
}

