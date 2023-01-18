package src;

import lombok.NonNull;

public class BookStatistics {
    int paragraph;
    int image;
    int tables;

    public BookStatistics(){
        paragraph = 0;
        image =0;
        tables =0;

    }
    public void printStatistics() {
        System.out.println( "Book Statistics:\n" +
                "*** Number of images: " + image+"\n"+
                "*** Number of tables: "+tables+"\n" +
                "*** Number of paragraphs: "+paragraph);

    }

    public void visit(Paragraph paragraph) {
        this.paragraph +=1;

    }
    public void visit(Image image) {
        this.image +=1;

    } public void visit(Table table) {
        this.tables +=1;

    }


}
