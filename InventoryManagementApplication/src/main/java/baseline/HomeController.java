package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
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

    ObservableList<Item> inventory = FXCollections.observableArrayList(
            new Item("Example Item", "A-111-111-111", "$6", 5),
            new Item("Test Item", "A-111-111-112", "$8", 1)
    );
    FilteredList<Item> filteredList = new FilteredList<>(inventory, b -> true);

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
    private void editName(TableColumn.CellEditEvent<Item,String> productStringCellEditEvent) {
        //button click
        //get selected item
        //allow edit in cell
        Item itemSelected = tableview.getSelectionModel().getSelectedItem();
        itemSelected.setName(productStringCellEditEvent.getNewValue());
    }
    @FXML
    private void editSerialNum(TableColumn.CellEditEvent<Item,String> productStringCellEditEvent) {
        //button click
        //get selected item
        //allow edit in cell
        Item itemSelected = tableview.getSelectionModel().getSelectedItem();
        itemSelected.setSerialNum(productStringCellEditEvent.getNewValue());
    }
    @FXML
    private void delete() {
        //button click
        //get selected item index
        //remove index
        int index = tableview.getSelectionModel().getSelectedIndex();
        tableview.getItems().remove(index);
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
        Stage stage = new Stage();
        stage.setTitle("Add Item");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void saveList() {
        //button click
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       nameList.setCellValueFactory(new PropertyValueFactory<>("name"));
       priceList.setCellValueFactory(new PropertyValueFactory<>("price"));
       numItem.setCellValueFactory(new PropertyValueFactory<>("numItems"));
       serialList.setCellValueFactory(new PropertyValueFactory<>("serialNum"));
       tableview.setItems(inventory);

       tableview.setEditable(true);
       nameList.setCellFactory(TextFieldTableCell.forTableColumn());

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
        searchBar.textProperty().addListener((observable, oldValue, newValue) -> filteredList.setPredicate(item -> {
            if((newValue == null) || newValue.isEmpty()){
                return true;
            }

            String lowerCase = newValue.toLowerCase();

            if(item.getName().toLowerCase().contains(lowerCase)) {
                return true;
            }else if (item.getSerialNum().toLowerCase().contains(lowerCase)) {
                return true;
            }else return item.getPrice().toLowerCase().contains(lowerCase);
        }));

        SortedList<Item> sortedList = new SortedList<>(filteredList);
        sortedList.comparatorProperty().bind(tableview.comparatorProperty());
        tableview.setItems(sortedList);
    }
}