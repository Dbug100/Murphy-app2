package baseline;
 /*  UCF COP3330 Fall 2021 Application Assignment 2 Solution
  *  Copyright 2021 Deaja Murphy
  */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HomeController {
    @FXML
    private TableView<Item> tableview;
    @FXML
    private TextField searchBar;
    @FXML
    private TableColumn<Item,String> nameList;
    @FXML
    private TableColumn<Item,Integer> priceList;
    @FXML
    private TableColumn<Item,Integer> numItem;
    @FXML
    private TableColumn<Item,String> serialList;
    private ObservableList<Item> inventory = FXCollections.observableArrayList();


    @FXML
    private void serialSort() {
        //button click
        //use getSortOrder
    }
    @FXML
    private void nameSort() {
        //button click
        //use getSortOrder
    }
    @FXML
    private void nameSearch() {
        //button click
        //wrap observable list into filtered list
        //filterField
        //if field is empty show all items
        //make string to make input lowercase
        //if .getName().toLowerCase().contains(input to lower case)
        //return true
        //else return false
        //wrap filtered list into sorted list
        //bind list to table
        //setItems

    }
    @FXML
    private void serialSearch() {
        //button click
        //wrap observable list into filtered list
        //filterField
        //if field is empty show all items
        //make string to make input lowercase
        //if .getName().toLowerCase().contains(input to lower case)
        //return true
        //else return false
        //wrap filtered list into sorted list
        //bind list to table
        //setItems
    }
    @FXML
    private void editName(TableColumn.CellEditEvent editCell) {
        //button click
        //tableview.getSelectionModel().getSelectedItem();
        //.setName(editCell.getNewValue().toString()
    }
    @FXML
    private void editSerialNum(TableColumn.CellEditEvent editCell) {
        //button click
        //tableview.getSelectionModel().getSelectedItem();
        //.setSerialNum(editCell.getNewValue().toString()
    }
    @FXML
    private void delete() {
        //button click
        //tableview.getSelectionModel().getSelectedItem();
        //tableview.getItems().remove(selection)
    }
    @FXML
    private void deleteAll() {
        //button click
        //tableview.getItems().clear();
    }
    @FXML
    private void addItemScreen() {
        //button click
        //open add item screen
    }
    @FXML
    private void saveList() {
        //button click
    }

}
