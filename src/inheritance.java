import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    protected String id;
    protected String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

    public String getId() {
        return id;
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

    public void setProgrammingFundamentalsMarks(double marks) {
        this.programmingFundamentalsMarks = marks;
    }

    public double getDatabaseManagementSystemMarks() {
        return databaseManagementSystemMarks;
    }

    public void setDatabaseManagementSystemMarks(double marks) {
        this.databaseManagementSystemMarks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", PF Marks: " + programmingFundamentalsMarks + ", DBMS Marks: " + databaseManagementSystemMarks;
    }
}

// Extended class to hold student academic records
class StudentRecord extends Student {
    private double pfMarks;
    private double dbmsMarks;

    public StudentRecord(String id, String name) {
        super(id, name);
    }

    // Getters and Setters for Marks
    public double getPfMarks() { return pfMarks; }
    public void setPfMarks(double pfMarks) { this.pfMarks = pfMarks; }
    public double getDbmsMarks() { return dbmsMarks; }
    public void setDbmsMarks(double dbmsMarks) { this.dbmsMarks = dbmsMarks; }
}

// Class to manage students
class StudentManager {
    private ArrayList<StudentRecord> students = new ArrayList<>();

    // Add a new student
    public void addStudent(String id, String name) {
        // Check for existing student
        for (StudentRecord s : students) {
            if (s.getId().equals(id)) {
                System.out.println("Student already exists.");
                return;
            }
        }
        students.add(new StudentRecord(id, name));
    }

    // Update student details
    public void updateStudent(String id, String newName) {
        for (StudentRecord s : students) {
            if (s.getId().equals(id)) {
                s.setName(newName);
                return;
            }
        }
        System.out.println("Student not found.");
    }

 public void deleteStudent(String id) {
        StudentRecord student = findStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private StudentRecord findStudent(String id) {
        for (StudentRecord s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // Method to find a student by ID
    public StudentRecord findStudent(String id) {
        for (StudentRecord s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
}

public void bestInProgrammingFundamentals() {
    Student bestStudent = null;
    double highestMarks = 0.0;

    for (Student student : students) {
        if (student.getProgrammingFundamentalsMarks() > highestMarks) {
            bestStudent = student;
            highestMarks = student.getProgrammingFundamentalsMarks();
        }
    }

    if (bestStudent != null) {
        System.out.println("Best in Programming Fundamentals: " + bestStudent);
    } else {
        System.out.println("No students found.");
    }
}

// Method to find the best student in Database Management System
public void bestInDatabaseManagementSystem() {
    Student bestStudent = null;
    double highestMarks = 0.0;

    for (Student student : students) {
        if (student.getDatabaseManagementSystemMarks() > highestMarks) {
            bestStudent = student;
            highestMarks = student.getDatabaseManagementSystemMarks();
        }
    }

    if (bestStudent != null) {
        System.out.println("Best in Database Management System: " + bestStudent);
    } else {
        System.out.println("No students found.");
    }
}

// Main class to run the program
public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int option;

    do {
            System.out.println("1. Add Student\n2. Update Student\n3. Delete Student\n4. List All Students\n5. Exit");
            System.out.print("Enter an option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = input.next();
                    System.out.print("Enter Student Name: ");
                    String name = input.next();
                    manager.addStudent(id, name);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    id = input.next();
                    System.out.print("Enter New Student Name: ");
                    name = input.next();
                    manager.updateStudent(id, name);
                    break;
                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    id = input.next();
                    manager.deleteStudent(id);
                    break;
                case 4:
                    manager.listStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
    }
}
