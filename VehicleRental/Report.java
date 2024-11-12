package VehicleRental;
import java.io.IOException;
import java.io.FileWriter;
public class Report{
    //Defining printToConsole method below which is declared static as no object is created in test class to call the below method.
    public static void printToConsole(Reportable reportable) {
        System.out.println(reportable.generateReport());
    }

    //Defining persistToCSV method below which is declared static as no object is created in test class to call the below method.
    public static void persistToCSV(Reportable reportable, String filename) {
        try(FileWriter writer = new FileWriter(filename)){ //making use of FileWriter class and creating an object from it which will help in generatingReport to csv.
            writer.append(reportable.generateReport());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }

}