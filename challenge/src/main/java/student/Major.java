package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
    }

    public Major() {
        this("", "");
        this.students = new Student[50];
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount == 50) {
            System.out.println("Maximum number of students reached");
            return;
        }
        students[studentCount] = s;
        studentCount++;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public Student[] getStudents() {
        return students;
    }
    public int getStudentCount() {
        return studentCount;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Major[" + id + ", " + code + ", " + name + ", " + studentCount + "]";
    }

    // Display all students in the major
    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            int tmp = i + 1;
            System.out.println(tmp + ". " + students[i].getCne() + " " +  students[i].getSecondName() + " " + students[i].getFirstName());
        }
    }

    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne() == cne) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne) {
        Student s = findStudentByCNE(cne);
        if (s != null) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getCne() == cne) {
                    for (int j = i + 1; j < studentCount; j++) {
                        students[j-1] = students[j];
                    }
                }
                break;
            }
            studentCount--;
            return true;
        }
        return false;
    }

    public void getOccupancyRate() {
        System.out.println(name + " capacity: 50 students");
        System.out.println("Current enrollment: " + studentCount + " student(s)");
        System.out.println("Occupancy rate = " + (studentCount / 50.0) * 100 + "%");
    }

    public StringBuilder getStudentListAsString() {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < studentCount - 1; i++) {
            StringBuilder tmpSb1 = new StringBuilder(students[i].getFullNameFormatted());
            sb.append(tmpSb1);
            sb.append(" | ");
        }
        StringBuilder tmpSb2 = new StringBuilder(students[studentCount - 1].getFullNameFormatted());
        sb.append(tmpSb2);

        return sb;
    }

}
