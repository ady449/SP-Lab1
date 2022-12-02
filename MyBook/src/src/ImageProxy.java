package src;

import lombok.Data;
import lombok.NonNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class ImageProxy implements Picture, Element {

    @NonNull
    String url;
    Dimension dim;
    Image image;
    List<Element> elements = new ArrayList<>();


    public Image loadImage(){
        if(image == null){
            image = new Image(url);
        }

        return image;
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

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return null;
    }
}
