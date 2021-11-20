package baseline;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;

import java.util.regex.Pattern;

public class Item {
    private String name;
    private String serialNum;
    private Integer price;
    private Integer numItems;

    public Item( String name, String serialNum, Integer price,Integer numItems) {

        this.name = name;
        this.price = price;
        this.numItems = numItems;
        String format = "A-111-111-111";
        Pattern p = Pattern.compile(format);
        if(p.matcher(serialNum).matches()){
            this.serialNum = serialNum;
        }else{
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Serial Number Must be in format A-XXX-XXX-XXX");
            errorAlert.showAndWait();
        }


    }
    public void setName(String name){
        this.name = name;
    }

    public void setSerialNum(String serialNum){
        this.serialNum = serialNum;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public void setNumItems(Integer numItems){
        this.numItems = numItems;
    }

    public String getName() {
        return name;
    }

    public String getSerialNum() {
       return serialNum;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getNumItems() {
        return numItems;
    }
}
