import src.Author;
import src.Book;
import src.Chapter;
import src.SubChapter;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapteOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapteOne);

        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitoul 1.1");
        SubChapter scOneOne =chp1.getSubChapter(indexChapteOne);

        scOneOne.createNewParagraph("Paragraph1");
        scOneOne.createNewParagraph("Paragraph2");
        scOneOne.createNewParagraph("Paragraph3");
        scOneOne.createImage("image1");
        scOneOne.createNewParagraph("Paragraph4");
        scOneOne.createTable("table1");
        scOneOne.createNewParagraph("Paragraph5");

        scOneOne.print(); // output: Book(Disco Titanic, [Paragraph1, Paragraph2, Paragraph3, Paragraph4, Paragraph5], [table1], [image1])

    }
}
