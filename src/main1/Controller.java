package main1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    @FXML
    Button themDuLieu;

    public void timKiemAction(ActionEvent event) {
        System.out.println("Button Clicked!");

        Date now= new Date();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        // Dữ liệu Model
        String dateTimeString = df.format(now);

        // Hiển thị lên VIEW.
        //myTextField.setText(dateTimeString);

    }


    public void xuatExcelAction(ActionEvent event) {
        System.out.println("Button Clicked!");

        Date now= new Date();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        // Dữ liệu Model
        String dateTimeString = df.format(now);

        // Hiển thị lên VIEW.
        //myTextField.setText(dateTimeString);

    }

    public void themDuLieuAction(ActionEvent event) {
        Stage stage = new Stage();
        Parent myNewScene = null;
        if (event.getSource() == themDuLieu){
            //stage = (Stage) themDuLieu.getScene().getWindow();
            try {
                myNewScene = FXMLLoader.load(getClass().getResource("insert.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Scene scene = new Scene(myNewScene);
        stage.setScene(scene);
        stage.setTitle("Nhập dữ liệu");
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        //stage.setX(bounds.getMinX());
        //stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth() / 1.5);
        stage.setHeight(bounds.getHeight() / 1.5);
        stage.show();

    }

}
