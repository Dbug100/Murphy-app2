package baseline;
 /*  UCF COP3330 Fall 2021 Application Assignment 2 Solution
  *  Copyright 2021 Deaja Murphy
  */


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddController  {
    @FXML
    TextField name;
    @FXML
    TextField serialNum;
    @FXML
    TextField price;
    @FXML
    TextField numItems;

    @FXML
    private void addItem() {
        //button click
        //FXML loader = home.fxml resources
        // parent root = loader
        // HomeController = loader controller
        // HomeController.addToList(name.getText, serialNum.getInt...,etc)
        //
    }

    private void addToList(String name, String serialNum, Integer price, Integer numItems){
        //set the value for each using .setText
    }
}
