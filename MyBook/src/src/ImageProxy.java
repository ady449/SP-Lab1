package src;

import lombok.Data;
import lombok.NonNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy extends Image {


    String url;
    Dimension dim;
    Image image;
    List<Element> elements = new ArrayList<>();

    public ImageProxy(String name){
        super(name);
        url = name;

    }

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
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }


}
