package src;

import lombok.Data;
import lombok.NonNull;

@Data
public class Author {
    @NonNull
    private String name;
}
