package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(prenom, nom, telephone, email, cne, new Major("23", "ComputerScience"));
    }

    public Student() {
        this("", "", "", "", "", new Major("23", "ComputerScience"));
    }

    // Getters
    public String getCne() {
        return cne;
    }
    public Major getMajor() {
        return major;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }
    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student[" + id + ", " + firstName + ", " + secondName + ", " + phone + ", " + email + ", " + cne + ", " + major + "]";
    }

    public String getFullNameFormatted() {
        return String.format("%s, %s", secondName.toUpperCase(), firstName);
    }
}

