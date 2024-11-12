package VehicleRental;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    //Declaring private instance variables.
    private int InventoryID;
    private VehicleType vehicleType;
    private List<Vehicle> vehicles; //Using List interface of ArrayList class for the instance variable vehicles.

    // Declaring constructor below.
    public Inventory(int InventoryID, VehicleType vehicleType) {
        this.InventoryID = InventoryID;
        this.vehicleType = vehicleType;
        this.vehicles = new ArrayList<>();
    }

    // Defining getter methods below.
    public int getInventoryID() {
        return InventoryID;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    //defining setter methods below.
    public void setInventoryID(int InventoryID) {
        this.InventoryID = InventoryID;
    }

    public void addVehicle(Vehicle vehicle) { //addvehicle() method defined, which adds vehicles to the inventory based on vehicle type.
        if (vehicle.getVehicleType().equals(this.getVehicleType())) { // Providing condition to check if the vehicle type matches the inventory type, only if it matches we add to the inventory.
            vehicles.add(vehicle);
        }
    }

    public void removeVehicle(Vehicle vehicle) { //removeVehicle() method defined.
        vehicles.remove(vehicle);
    }

}
