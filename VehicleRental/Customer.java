package VehicleRental;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements Reportable{
    //Declaring private instance variables of Customer class below.
    private int id;
    private String name;
    private int discountRate;
    private List<RentalOrder> orderHistory;
    //Defining the constructor for Customer abstract class below.
    public Customer(int id, String name, int discountRate){
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
        this.orderHistory = new ArrayList<>();
    }
    // getter methods for private instance variables of this class.
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getDiscountRate(){
        return discountRate;
    }
    public List<RentalOrder> getOrderHistory(){
        return orderHistory;
    }
    //setter methods for private instance variables of this class.
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }
    // defining add order and remove order methods.
    public void addOrder(RentalOrder order){
        orderHistory.add(order);
    }
    public void removeOrder(RentalOrder order){
        orderHistory.remove(order);
    }
    public abstract String generateReport(); //Keeping generateReport() abstract, by only providing method definition.
}