package src;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@ToString(includeFieldNames = false)
public class Book {

    @NonNull private final String name;

    private Author author;
    private List<Chapter> chapters = new ArrayList<>();




    public void addAuthor(Author rpGheo) {
        author = rpGheo;
    }

    public int createChapter(String s) {
        Chapter ch = new Chapter(s);
        chapters.add(ch);
        return chapters.indexOf(ch);
    }

    public Chapter getChapter(int indexChapteOne) {
        return chapters.get(indexChapteOne);
    }
}
