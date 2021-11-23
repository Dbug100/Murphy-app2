package baseline;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
    private SimpleStringProperty name;
    private SimpleStringProperty serialNum;
    private SimpleStringProperty price;
    private SimpleIntegerProperty numItems;

    public Item( String name, String serialNum, String price,Integer numItems) {

        this.name = new SimpleStringProperty(name);
        this.price = new SimpleStringProperty(price);
        this.numItems = new SimpleIntegerProperty(numItems);
        this.serialNum = new SimpleStringProperty(serialNum);

    }
    public String getName(){
        return name.get();
    }

    public void setName(String name){
        this.name.set(name);
    }

    public String getSerialNum(){
        return serialNum.get();
    }

    public void setSerialNum(String serialNum){
        this.serialNum.set(serialNum);
    }

    public String getPrice(){
        return price.get();
    }

    public void setPrice(String price){
        this.price.set(price);
    }

    public int getNumItems(){
        return numItems.get();
    }

    public void setNumItems(int numItems){
        this.numItems.set(numItems);
    }

}

