package classes;

import java.util.ArrayList;
import java.util.List;

import classes.Author;
import classes.Chapter;
import lombok.*;

@Data
public class Book {
    @NonNull
    private final String name;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapter = new ArrayList<>();
    
    public void print(){
        System.out.println(this);
    }

    public Chapter getChapter(int index) {
        return chapter.get(index);
    }

    public void addAuthor(Author rpGheo) {
        authors.add(rpGheo);
    }

    public int createChapter(String s) {
        Chapter c = new Chapter(s);
        chapter.add(c);
        return chapter.indexOf(c);
    }

}
