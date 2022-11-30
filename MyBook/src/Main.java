import src.Book;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph1");
        discoTitanic.createNewParagraph("Paragraph2");
        discoTitanic.createNewParagraph("Paragraph3");
        discoTitanic.createImage("image1");
        discoTitanic.createNewParagraph("Paragraph4");
        discoTitanic.createTable("table1");
        discoTitanic.createNewParagraph("Paragraph5");

        discoTitanic.print(); // output: Book(Disco Titanic, [Paragraph1, Paragraph2, Paragraph3, Paragraph4, Paragraph5], [table1], [image1])

    }
}
