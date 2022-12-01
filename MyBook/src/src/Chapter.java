package src;

import lombok.Data;
import lombok.NonNull;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Data
public class Chapter {
    @NonNull
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public int createSubChapter(String s) {
        SubChapter sc = new SubChapter(s);
        subChapters.add(sc);

        return subChapters.indexOf(sc);
    }

    public SubChapter getSubChapter(int indexChapteOne) {
        return subChapters.get(indexChapteOne);
    }
}
