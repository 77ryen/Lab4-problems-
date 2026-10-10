package student;

public class Test {
    public static void main(String[] args) {

        Major major1 = new Major("11", "Math");
        Major major2 = new Major("12", "ComputerScience");
        Major major3 = new Major("13", "Chemistry");

        Student s1 = new Student("Djobni", "Dia", "6273514765", "Djobni.Dia@um6p.ma","11111111", major1);
        Student s2 = new Student("Latiz", "Yns", "6871969748", "Latiz.Yns@um6p.ma", "22222222", major2);
        Student s3 = new Student("Shkara", "Adm", "5379103019", "Shkara.Adm@um6p.ma", "33333333", major3);
        Student s4 = new Student("Piscine", "Ysn", "6345969748", "Piscine.Ysn@um6p.ma", "44444444", major2);

        // Display computer science students
        System.out.println("The list of students in the computer science major is: ");
        System.out.print("\n");
        major2.displayStudents();


        System.out.println("\n" + s1.getFullNameFormatted());

        Student s = major2.findStudentByCNE("22222222");
        System.out.println("\n" + s.equals(s2));

        System.out.println("\n" + major3.getStudentCount());
        System.out.println(major2.getStudentCount());

        System.out.println("\n" + major2.removeStudent("22222222"));

        System.out.print("\n");
        major2.getOccupancyRate();

        major2.addStudent(s2);
        System.out.print("\n");
        major2.getOccupancyRate();

        System.out.println(major2.getStudentListAsString());
    }
}

