package classes;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class SubChapter {
    @NonNull public String name;
    public List<Image> images;
    public List<Paragraph> paragraphs;
    public List<Table>  tables;


    public void print(){}

    public SubChapter(String name){
        this.name = name;
    }
    public void createNewParagraph(String s) {
    }

    public void createNewImage(String s) {
    }

    public void createNewTable(String s) {
    }
}
