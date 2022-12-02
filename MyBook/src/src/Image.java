package src;

import lombok.Data;
import lombok.NonNull;

import java.awt.*;
import java.util.concurrent.TimeUnit;

@Data
public class Image implements Element {
    @NonNull
    private String image;

    public Image(String name) {
        image = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Image: " + image;
    }

    @Override
    public void print() {

    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
