package VehicleRental;

public class RentalOrder{
    //Declaring private instance variables of RentalOrder class.
    private double totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;
    //Defining first constructor of RentalOrder class that takes rentalLength as 1 by default.
    public RentalOrder(Customer customer, Vehicle vehicle){
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = 1;
    }
    //Defining constructor of this class again by overloading that takes in custom rentalLength.
    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength){
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
    }
    //Getter methods for private instance variables.
    public double getTotalCost(){
        return totalCost;
    }
    public Customer getCustomer(){
        return customer;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public int getRentalLength(){
        return rentalLength;
    }
    //Setter methods for private instance variables.
    public void setRentalLength(int rentalLength){
        this.rentalLength = rentalLength;
    }
    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }
    //Calculating total cost of renting vehicle after discount.
    public double calculateTotalCost(){
        double baseCost = vehicle.getDailyRate() * rentalLength;
        double discount = baseCost * ((double) customer.getDiscountRate() /100);
        double totalCost = baseCost - discount;
        this.setTotalCost(totalCost);
        return totalCost;
    }
    //Defining completeOrder method and making vehicle unavailable afterwards.
    public void completeOrder(){
        calculateTotalCost();
        customer.addOrder(this);
        vehicle.setAvailable(false);
    }
}