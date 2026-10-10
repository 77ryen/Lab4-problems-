package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        // add others
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    public Person() {
        this.id = nextId++;
        this.firstName = "";
        this.secondName = "";
        this.phone = "";
        this.email = "";
    }

    public int getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getEmail() {
        return this.email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person[" + id + ", " + firstName + ", " + secondName + ", " + phone + ", " + email + "]";
    }


}

