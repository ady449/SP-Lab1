package src;

public class Paragraph implements Element {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private AlignStrategy textAlignment;
    public Paragraph(String paragraph1) {
        description = paragraph1;
    }

    @Override
    public String toString() {
        return "Paragraph: "+ description;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }

    public void setAlignStrategy(AlignStrategy align) {
        description = align + description;
    }
}
