# VehicleRentalSystem
A Java-based Object-Oriented Programming project that simulates a vehicle rental management system.  This project demonstrates core OOP principles including inheritance, polymorphism, encapsulation, and abstraction. It also shows implementations of interfaces, composition, dependency injection, single responsibility principle and open closed principle.

# Project Structure
├── src/
│   ├── Vehicle.java           # Base class for vehicles
│   ├── VehicleType.java       # Enum for vehicle types
│   ├── Inventory.java         # Manages collections of vehicles
│   ├── RentalOffice.java      # Manages rental operations
│   ├── Customer.java          # Abstract base class for customers
│   ├── Individual.java        # Represents individual customers
│   ├── Corporate.java         # Represents corporate customers
│   ├── RentalOrder.java       # Handles rental transactions
│   ├── Report.java           # Handles reporting functionality
│   ├── Reportable.java       # Interface for report generation
│   └── Test.java             # Main test class

# Features
* Vehicle management with different types (Car, SUV, Truck)
* Inventory management system
* Customer management (Individual and Corporate)
* Rental order processing
* Report generation (Console and CSV output)
* Type validation and error handling

