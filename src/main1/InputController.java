package main1;


import javafx.event.ActionEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputController {

    public void luuAction(ActionEvent event) {
        System.out.println("Button Clicked!");

        Date now= new Date();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        // Dữ liệu Model
        String dateTimeString = df.format(now);

        // Hiển thị lên VIEW.
        //myTextField.setText(dateTimeString);

    }
}
