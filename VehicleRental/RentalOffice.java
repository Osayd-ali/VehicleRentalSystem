package VehicleRental;

import java.util.ArrayList;
import java.util.List;

public class RentalOffice implements Reportable{
    // Declaring instance variables as private.
    private int officeID;
    private String locationZip;
    private List<Inventory> inventories; //Declaring List type as Inventory as we send objects of Inventory class to the inventories list.
    private List<RentalOrder> orderHistory; //Declaring List type as RentalOrder as we send objects of Rental Order to the orderHistory list.
    // Constructor for RentalOffice class.
    public RentalOffice(int officeID, String locationZip){
        this.officeID = officeID;
        this.locationZip = locationZip;
        this.inventories = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }
    // getter methods for the private instance variables.
    public int getOfficeID(){
        return officeID;
    }
    public String getLocationZip() {
        return locationZip;
    }
    public List<Inventory> getInventories() {
        return inventories;
    }
    public List<RentalOrder> getOrderHistory() {
        return orderHistory;
    }
    // setter methods for the private instance variables.
    public void setOfficeID(int officeID){
        this.officeID = officeID;
    }
    public void setLocationZip(String locationZip){
        this.locationZip = locationZip;
    }
    // add and remove methods for inventories list and orderHistory list.
    public void addInventory(Inventory inventory){ //Adding each inventory to the inventories list.
        boolean isPresent = false;
        for(Inventory x: inventories){
            if(x.getVehicleType().equals(inventory.getVehicleType())){ //Checking if two inventories are of same type.
                isPresent = true; //If two inventories are of same type then ending the method and not adding to the inventories list.
                return;
            }
        }
        inventories.add(inventory);
    }
    public void removeInventory(Inventory inventory){ //removing inventory from inventories list.
        inventories.remove(inventory);
    }
    public void addOrder(RentalOrder order){ //Adding order to the orderHistory by taking in object of RentalOrder.
        orderHistory.add(order);
    }
    //Implementing generateReport() method of interface reportable below.
    public String generateReport(){
        StringBuilder s = new StringBuilder();
        // appending or concatenating each instance variable in this class.
        s.append("Report for rental office: \n");
        s.append("Rental Office ID: ").append(getOfficeID()).append("\n");
        s.append("Location zip code is: ").append(getLocationZip()).append("\n");
        //Adding inventories information.
        s.append("Inventories list: \n");
        for(Inventory n: inventories){
            s.append("\t Inventoy ID: ").append(n.getInventoryID()).append(", Inventory type: ").append(n.getVehicleType());
            //Listing vehicles in each inventory.
            for(Vehicle v: n.getVehicles()){
                s.append("\n\t Vehicle ID: ").append(v.getVehicleID())
                        .append(", Make: ").append(v.getMake())
                        .append(", Model: ").append(v.getModel())
                        .append(", year: ").append(v.getYear())
                        .append(", mileage: ").append(v.getMileage())
                        .append(", type: ").append(v.getVehicleType())
                        .append(", available: ").append(v.getAvailable())
                        .append(", Daily rate: $").append(v.getDailyRate());
            }
            s.append("\n");
        }
        // Adding order history information
        s.append("Order History: \n");
        for(RentalOrder o : orderHistory){
            s.append("\t Order: ")
                    .append(o.getCustomer().getId())
                    .append("\n")
                    .append("\t Name: ").append(o.getCustomer().getName())
                    .append("\n")
                    .append("\t Discount: ").append(o.getCustomer().getDiscountRate())
                    .append("\n")
                    .append("\t Vehicle details: \n")
                    .append("\t Vehicle ID: ").append(o.getVehicle().getVehicleID())
                    .append("\n")
                    .append("\t Make: ").append(o.getVehicle().getMake())
                    .append("\n")
                    .append("\t Model: ").append(o.getVehicle().getModel())
                    .append("\n")
                    .append("\t Year: ").append(o.getVehicle().getYear())
                    .append("\n")
                    .append("\t Mileage: ").append(o.getVehicle().getMileage())
                    .append("\n")
                    .append("\t Type: ").append(o.getVehicle().getVehicleType())
                    .append("\n")
                    .append("\t is Available? ").append(o.getVehicle().getAvailable())
                    .append("\n")
                    .append("\t Daily Rate: ").append(o.getVehicle().getDailyRate())
                    .append("\n")
                    .append("\t Rental Length: ").append(o.getRentalLength())
                    .append("\n")
                    .append("\t Total Cost: $").append(o.getTotalCost())
            .append("\n\n");
        }
        return s.toString();
    }
}

