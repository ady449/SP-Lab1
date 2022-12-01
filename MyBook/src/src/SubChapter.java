package src;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class SubChapter {
    @NonNull
    private String name;
    private List<Paragraph> paragraph = new ArrayList<>();
    private List<Table> table = new ArrayList<>();
    private List<Image> image = new ArrayList<>();


    public void createNewParagraph(String paragraph1) {
        this.paragraph.add(new Paragraph(paragraph1));
    }

    public void createImage(String image1) {

        this.image.add(new Image(image1));
    }

    public void createTable(String table1) {
        this.table.add(new Table(table1));
    }

    @Override
    public String toString(){

        return "Subchapter: " + name+"\n"
                +paragraph
                + image
                + table;
    }
    public void print() {
        System.out.println(this);
    }
}
