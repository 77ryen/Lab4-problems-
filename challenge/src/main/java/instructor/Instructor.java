package instructor;
import student.Person;

public class Instructor extends Person{
    private String employeeNumber;

    public Instructor(String employeeNumber, String firstName, String secondName, String telephone, String email) {
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employeeNumber;
    }


    public String cleanEmployeeNumber() {
        return employeeNumber.replace(" ", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, secondName, firstName);
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n")
                .append("----------\n")
                .append("Employee #: ").append(employeeNumber).append("\n")
                .append("Name      : ").append(secondName).append(", ").append(firstName).append("\n")
                .append("Email     : ").append(email).append("\n")
                .append("Phone     : ").append(phone);
        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();

        boolean hasLastName = (secondName != null && !secondName.isBlank());
        boolean hasFirstName = (firstName != null && !firstName.isBlank());

        if (hasLastName) {
            sb.append(secondName);
        }

        if (hasFirstName) {
            if (hasLastName) {
                sb.append(" ");
            }
            sb.append(firstName);
        }

        return sb.toString();
    }
}
