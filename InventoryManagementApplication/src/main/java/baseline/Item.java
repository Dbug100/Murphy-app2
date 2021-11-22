package baseline;

import javafx.scene.control.Alert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Item {
    private String name;
    private String serialNum;
    private String price;
    private String numItems;

    public Item( String name, String serialNum, String price,String numItems) {

        this.name = name;
        this.price = price;
        this.numItems = numItems;
        this.serialNum = serialNum;

    }
    public void setName(String name){
        this.name = name;
    }

    public void setSerialNum(String serialNum){
        this.serialNum = serialNum;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public void setNumItems(String numItems){
        this.numItems = numItems;
    }
}
