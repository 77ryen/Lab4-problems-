package instructor;

public class Subject {
    private static int nextId = 1;
    private int id;
    private String code;
    private String title;

    public Subject(String code, String title) {
        this.id = nextId++;
        this.code = code;
        this.title = title;
    }


    public String normalizedCode() {
        return code.replace(" ", "").toUpperCase();
    }

    public String properTitle() {
        String[] words = title.split("\\s+");
        StringBuilder proper = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                proper.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return proper.toString().trim();
    }

    public boolean isIntroCourse() {
        boolean titleMatches = (title != null) && title.toLowerCase().contains("intro");
        boolean codeMatches = (code != null) && code.toLowerCase().startsWith("intro-");

        return titleMatches || codeMatches;
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();

        sb.append(code)
                .append(" - ")
                .append(title)
                .append(" (Instructor: ");

        if (instructor != null) {
            sb.append(instructor.getSecondName())
                    .append(" ")
                    .append(instructor.getFirstName());
        }

        sb.append(")");

        return sb.toString();
    }
}
