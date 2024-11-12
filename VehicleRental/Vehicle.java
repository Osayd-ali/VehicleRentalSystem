package VehicleRental;

public class Vehicle{
    // Declaring instance variables.
    private int VehicleID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private boolean available;
    private int dailyRate;
    private VehicleType vehicleType; //Enum type VehicleType declared globally in another file.
    
    // Constructor for class Vehicle below.
    public Vehicle(int VehicleID, String make, String model, int year, int mileage, VehicleType vehicleType, int dailyRate){
        this.VehicleID = VehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.available = true; //Defaults to true as mentioned in the requirements.
        this.dailyRate = dailyRate;
        this.vehicleType = vehicleType;
    }
    //getter methods below.
    public int getVehicleID() {
        return VehicleID;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getMileage() {
        return mileage;
    }
    public boolean getAvailable() {
        return available;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    // Setter methods below.
    public void setVehicleID(int VehicleID){
        this.VehicleID = VehicleID;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void setDailyRate(int dailyRate){
        this.dailyRate = dailyRate;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
