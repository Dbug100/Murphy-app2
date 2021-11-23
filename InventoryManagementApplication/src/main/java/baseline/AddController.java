package baseline;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;

public class AddController extends HomeController {
    @FXML
    TextField name;
    @FXML
    TextField serialNum;
    @FXML
    TextField price;
    @FXML
    TextField numItems;

    @FXML
    private void addItem() throws IOException {
        //button click
        String format = "A-111-111-111";
        Pattern p = Pattern.compile(format);
        if(p.matcher(serialNum.getText()).matches()){
            // all good
            Item newItem = new Item(name.getText(), serialNum.getText(),"$"+numItems.getText(), price.getAnchor());
            tableview.getItems().add(newItem);
        } else {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Serial Number Must be in format A-XXX-XXX-XXX");
            errorAlert.showAndWait();

        }

    }
}
