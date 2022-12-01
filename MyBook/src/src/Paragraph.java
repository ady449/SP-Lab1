package src;

public class Paragraph {
    private String description;

    public Paragraph(String paragraph1) {
        description = paragraph1;
    }

    @Override
    public String toString() {
        return "Paragraph: "+ description+"\n";
    }
}
