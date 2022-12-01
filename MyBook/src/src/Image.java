package src;

import lombok.Data;
import lombok.NonNull;

@Data
public class Image {
    @NonNull
    private String image;

    @Override
    public String toString() {
        return "Image: " + image + "\n";
    }
}
