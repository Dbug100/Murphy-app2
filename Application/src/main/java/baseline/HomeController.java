package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
     TableView<Item> tableview;
    @FXML
    private TextField searchBar;
    @FXML
    private TableColumn<Item,String> nameList;
    @FXML
    private TableColumn<Item,String> priceList;
    @FXML
    private TableColumn<Item,String> numItem;
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
        Item itemSelected = tableview.getSelectionModel().getSelectedItem();
        itemSelected.setName(editCell.getNewValue().toString());
    }
    @FXML
    private void editSerialNum(TableColumn.CellEditEvent editCell) {
        //button click
        //tableview.getSelectionModel().getSelectedItem();
        //.setSerialNum(editCell.getNewValue().toString()
        Item itemSelected = tableview.getSelectionModel().getSelectedItem();
        itemSelected.setSerialNum(editCell.getNewValue().toString());
    }
    @FXML
    private void delete() {
        //button click
        //tableview.getSelectionModel().getSelectedItem();
        //tableview.getItems().remove(selection)
        ObservableList<Item> selection;
        selection = tableview.getSelectionModel().getSelectedItems();
        tableview.getItems().remove(selection);
    }
    @FXML
    private void deleteAll() {
        //button click
        tableview.getItems().clear();

    }
    @FXML
    private void addItemScreen() throws IOException {
        //button click
        //open add item screen
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryManagementApplication.class.getResource("add.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        AddController controller = fxmlLoader.getController();
        Stage stage = new Stage();
        stage.setTitle("Add Item");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void saveList() {
        //button click
    }

    public ObservableList<Item> getInventory(){
        ObservableList<Item> inventoryList = FXCollections.observableArrayList();
        inventoryList.add(new Item("Example Item", "A-111-111-111", "5", "5"));
        return inventoryList;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       /* nameList.setCellValueFactory(new PropertyValueFactory<Item, String>("Name"));
        priceList.setCellValueFactory(new PropertyValueFactory<Item, String>("Price"));
        numItem.setCellValueFactory(new PropertyValueFactory<Item, String>("Quantity"));
        serialList.setCellValueFactory(new PropertyValueFactory<Item, String>("Serial Number"));*/
        tableview.setItems(getInventory());
    }
    /*@FXML
    public void addToList(String name, String serialNum, String price, String numItems) {
        setName(name);
        setSerialNum(serialNum);
        setPrice(price);
        setNumItems(numItems);
        Item item = new Item(name, serialNum, price, numItems);
        tableview.getItems().add(item);
    }*/
}