package VehicleRental;

public class Individual extends Customer{
    //Declaring private instance variables for Individual class.
    private int age;
    private String state;
    private String zip;
    public Individual(int id, String name, int discountRate, int age, String state, String zip){
        super(id, name, discountRate); //Utilising Super constructor to access private instance variables of Customer abstract class.
        this.age = age;
        this.state = state;
        this.zip = zip;
    }
    // Getter methods for private instance variables of this class below.
    public int getAge(){
        return age;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }
    //Setter methods for private instance variables below.
    public void setAge(int age){
        this.age = age;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    //Implementing addOrder() and removeOrder() methods again in this class.
    public void addOrder(RentalOrder order){
        getOrderHistory().add(order);
    }
    public void removeOrder(RentalOrder order){
        getOrderHistory().remove(order);
    }
    //Implementing generateReport() method again in this class.
    public String generateReport(){
        StringBuilder s = new StringBuilder();
        s.append("Report for individual: \n");
        s.append("Individual details: \n");
        s.append("\t Individual Age: ").append(this.getAge()).append("\n")
                .append("\t State: ").append(this.getState()).append("\n")
                .append("\t Zip: ").append(this.getZip()).append("\n");
        // Adding order history information
        s.append("Order History: \n");
        for(RentalOrder o : getOrderHistory()){
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