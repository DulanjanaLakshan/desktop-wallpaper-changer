package com.dulanjanalakshan.dwcui.Controller;
import com.dulanjanalakshan.dwcui.Entity.City;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;


public class CityController{
    public ImageView img;
    public Label name;

    private City currentCity; // Store the currently displayed city

    public void setData(City city){
        currentCity = city; // Store the current city
        Image image = new Image(getClass().getResourceAsStream(city.getImgSrc()));
        img.setImage(image);
    }

    public void OnClickImage(MouseEvent mouseEvent) {
        if (currentCity != null) {
            System.out.println("Clicked image of city: " + currentCity.getName());
            System.out.println("Image path: " + currentCity.getImgSrc());
            changeWallpaper("F:\\Personal Project\\DWC-Ui\\src\\main\\resources"+currentCity.getImgSrc());
        }
    }
    public interface User32 extends Library {
        User32 INSTANCE = Native.load("user32", User32.class, W32APIOptions.DEFAULT_OPTIONS);

        int SPI_SETDESKWALLPAPER = 0x0014;
        int SPIF_UPDATEINIFILE = 0x01;
        int SPIF_SENDCHANGE = 0x02;

        boolean SystemParametersInfo(int uiAction, int uiParam, String pvParam, int fWinIni);
    }

    public void changeWallpaper(String imagePath) {
        boolean result = User32.INSTANCE.SystemParametersInfo(
                User32.SPI_SETDESKWALLPAPER,
                0,
                imagePath,
                User32.SPIF_UPDATEINIFILE | User32.SPIF_SENDCHANGE
        );

        if (result) {
            System.out.println("Wallpaper changed successfully");
        } else {
            System.err.println("Failed to change wallpaper");
        }
    }
}
