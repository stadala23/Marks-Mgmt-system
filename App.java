import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
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

class UndergraduateStudent extends Student {
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

class GraduateStudent extends Student {
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

class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                System.out.println("Student already exists.");
                return;
            }
        }
        students.add(student);
    }

    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(String id, String newName) {
        Student student = findStudent(id);
        if (student != null) {
            student.setName(newName);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String id) {
        Student student = findStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void updateStudentMarks(String id, double pfMarks, double dbmsMarks) {
        Student student = findStudent(id);
        if (student != null) {
            student.setProgrammingFundamentalsMarks(pfMarks);
            student.setDatabaseManagementSystemMarks(dbmsMarks);
        } else {
            System.out.println("Student not found.");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getBestStudentInProgrammingFundamentals() {
        Student bestStudent = null;
        double highestMarks = 0.0;

        for (Student student : students) {
            if (student.getProgrammingFundamentalsMarks() > highestMarks) {
                highestMarks = student.getProgrammingFundamentalsMarks();
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public Student getBestStudentInDatabaseManagementSystem() {
        Student bestStudent = null;
        double highestMarks = 0.0;

        for (Student student : students) {
            if (student.getDatabaseManagementSystemMarks() > highestMarks) {
                highestMarks = student.getDatabaseManagementSystemMarks();
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}

class Menu {
    private StudentManager studentManager;
    private Scanner scanner;

    public Menu() {
        studentManager = new StudentManager();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("1. Add Undergraduate Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Update Student Name");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Students");
            System.out.println("7. Exit");
            System.out.println("8. Display Best Student in Programming Fundamentals");
            System.out.println("9. Display Best Student in Database Management System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addUndergraduateStudent();
                    break;
                case 2:
                    addGraduateStudent();
                    break;
                case 3:
                    updateStudentName();
                    break;
                case 4:
                    updateStudentMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    displayStudents();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                case 8:
                    displayBestStudentInProgrammingFundamentals();
                    break;
                case 9:
                    displayBestStudentInDatabaseManagementSystem();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addUndergraduateStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        UndergraduateStudent student = new UndergraduateStudent(id, name, major);
        studentManager.addStudent(student);
        System.out.println("Undergraduate Student added successfully.");
    }

    private void addGraduateStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Research Area: ");
        String researchArea = scanner.nextLine();
        GraduateStudent student = new GraduateStudent(id, name, researchArea);
        studentManager.addStudent(student);
        System.out.println("Graduate Student added successfully.");
    }

    private void updateStudentName() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        studentManager.updateStudent(id, newName);
        System.out.println("Student name updated successfully.");
    }

    private void updateStudentMarks() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Programming Fundamentals Marks: ");
        double pfMarks = scanner.nextDouble();
        System.out.print("Enter Database Management System Marks: ");
        double dbmsMarks = scanner.nextDouble();
        studentManager.updateStudentMarks(id, pfMarks, dbmsMarks);
        System.out.println("Student marks updated successfully.");
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        studentManager.deleteStudent(id);
        System.out.println("Student deleted successfully.");
    }

    private void displayStudents() {
        List<Student> students = studentManager.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void displayBestStudentInProgrammingFundamentals() {
        Student bestStudent = studentManager.getBestStudentInProgrammingFundamentals();
        if (bestStudent != null) {
            System.out.println("Best Student in Programming Fundamentals: " + bestStudent);
        } else {
            System.out.println("No student data available.");
        }
    }

    private void displayBestStudentInDatabaseManagementSystem() {
        Student bestStudent = studentManager.getBestStudentInDatabaseManagementSystem();
        if (bestStudent != null) {
            System.out.println("Best Student in Database Management System: " + bestStudent);
        } else {
            System.out.println("No student data available.");
        }
    }
}

public class App1 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}