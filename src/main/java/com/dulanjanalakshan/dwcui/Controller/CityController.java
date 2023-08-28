package com.dulanjanalakshan.dwcui.Controller;

import com.dulanjanalakshan.dwcui.Entity.City;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CityController {
    public ImageView img;
    public Label name;

    public void setData(City city){
        Image image = new Image(getClass().getResourceAsStream(city.getImgSrc()));
        img.setImage(image);
        name.setText(city.getName());
    }
}
