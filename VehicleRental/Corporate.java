package VehicleRental;

public class Corporate extends Customer{
    //Declaring private instance variables of Corporate class.
    private String country;
    private String taxID;
    //Defining constructor for Corporate class.
    public Corporate(int id, String name, int discountRate, String country, String taxID){
        super(id, name, discountRate);
        this.country = country;
        this.taxID = taxID;
    }
    //Getter methods for private instance variables below.
    public String getCountry(){
        return country;
    }
    public String getTaxID(){
        return taxID;
    }
    //Setter methods for private instance variables below.
    public void setCountry(String country){
        this.country = country;
    }
    public void setTaxID(String taxID){
        this.taxID = taxID;
    }
    //Implementing addOrder and removeOrder methods again in this class.
    public void addOrder(RentalOrder order){
        getOrderHistory().add(order);
    }
    public void removeOrder(RentalOrder order){
        getOrderHistory().remove(order);
    }
    //Implementing generateReport() method again in this class.
    public String generateReport(){
        StringBuilder s = new StringBuilder();
        s.append("Report for corporate: ");
        s.append("Corporate details: ");
        s.append("\t Country: ").append(this.getCountry())
                .append("\t TaxID: ").append(this.getTaxID());
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