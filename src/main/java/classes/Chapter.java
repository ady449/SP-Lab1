package classes;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
//@NoArgsConstructor
public class Chapter {
    @NonNull
    public String name;
    public List<SubChapter> subchapter = new ArrayList<>();

    public Chapter(String name){
        this.name = name;
    }
    //    public void print(){}
    public int createSubChapter(String s) {
        SubChapter sc = new SubChapter(s);
        subchapter.add(sc);
        return subchapter.indexOf(sc);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subchapter.get(indexSubChapterOneOne);
    }
}
