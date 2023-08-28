package com.dulanjanalakshan.dwcui.Controller;

import com.dulanjanalakshan.dwcui.Entity.City;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public GridPane citiesGrid;

    private List<City> cities;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cities = new ArrayList<>(getCities());
        int column = 0;
        int row = 1;
        try {
            for (City city:cities) {
                FXMLLoader fxmlLoader=new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/views/City.fxml"));
                Pane pane=fxmlLoader.load();
                CityController cityController=fxmlLoader.getController();
                cityController.setData(city);

                if (column == 3){
                    column=0;
                    ++row;
                }
                citiesGrid.add(pane,column++,row);
                GridPane.setMargin(pane,new Insets(20));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private List<City> getCities() {
        List<City> ls = new ArrayList<>();
        City city = new City();
        city.setImgSrc("/assest/img/wall/Hotel-In-Coleman-Alberta-BCMI-Coleman.jpeg");
        ls.add(city);


        city = new City();
        city.setImgSrc("/assest/img/wall/People_Friends__entertainment__recreation_A_trip_to_the_sea_012981_.jpg");
        ls.add(city);


        city = new City();
        city.setImgSrc("/assest/img/wall/puteshestvennik_odinokij_odinochestvo_164795_2560x1600.jpg");
        ls.add(city);


        city = new City();
        city.setImgSrc("/assest/img/wall/1654427562_10-celes-club-p-oboi-na-rabochii-stol-puteshestviya-krasiv-16.jpg");
        ls.add(city);


        city = new City();
        city.setImgSrc("/assest/img/wall/travel-4k-clouds-mountains-7wmoz9la6tfkmvtr.jpg");
        ls.add(city);


        city = new City();
        city.setImgSrc("/assest/img/wall/wp3067481.jpg");
        ls.add(city);


        city = new City();
        city.setImgSrc("/assest/img/wall/Look-at-The-Himalayan-Wonders-in-Mera-Peak.jpg");
        ls.add(city);

        return ls;
    }
}
