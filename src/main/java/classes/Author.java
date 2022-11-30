package classes;

import lombok.Data;
import lombok.NonNull;

@Data
public class Author {
    @NonNull public String name;


    public void print() {}
}
