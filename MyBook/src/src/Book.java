package src;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@ToString(includeFieldNames = false)
public class Book {

    @NonNull private final String name;

    private List<String> paragraph = new ArrayList<>();
    private List<String> table = new ArrayList<>();
    private List<String> image = new ArrayList<>();


    public void createNewParagraph(String paragraph1) {
        this.paragraph.add(paragraph1);
    }

    public void createImage(String image1) {
        this.image.add(image1);
    }

    public void createTable(String table1) {
        this.table.add(table1);
    }

    public void print() {
        System.out.println(this);
    }
}
