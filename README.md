# VehicleRentalSystem
A Java-based Object-Oriented Programming project that simulates a vehicle rental management system.  This project demonstrates core OOP principles including inheritance, polymorphism, encapsulation, and abstraction. It also shows implementations of interfaces, composition, dependency injection, single responsibility principle and open closed principle.

## System Design (UML)

<img width="1502" alt="Screenshot 2024-11-12 at 1 48 29 AM" src="https://github.com/user-attachments/assets/cee19dc3-55cd-4def-9a10-7543d23399de">


# Features
* Vehicle management with different types (Car, SUV, Truck)
* Inventory management system
* Customer management (Individual and Corporate)
* Rental order processing
* Report generation (Console and CSV output)
* Type validation and error handling

# Core OOP Concepts Demonstrated
1. Encapsulation
   * Private fields with public getters/setters
   * Data validation in setters
2. Inheritance
   * Customer hierarchy (Individual and Corporate classes)
   * Method overriding
3. Polymorphism
   * Interface implementation
   * Method overloading in RentalOrder constructors
4. Abstraction
   * Abstract Customer class
   * Reportable interface

# Class Descriptions
1. Vehicle
  * Represents rentable vehicles
  * Properties: ID, make, model, year, mileage, type, availability, daily rate
2. Inventory
  * Manages collections of vehicles
  * Enforces type consistency within inventories
3. RentalOffice
  * Central management class
  * Handles inventories and rental orders
  * Generates comprehensive reports
4. Customer (Abstract)
  * Base class for all customer types
  * Handles common customer properties and behaviors
5. RentalOrder
  * Processes rental transactions
  * Calculates costs including discounts
  * Updates vehicle availability

# Development Decisions
* Used enum for VehicleType to ensure type safety
* Implemented Reportable interface for consistent reporting across classes
* Used constructor chaining in RentalOrder for cleaner code
* Implemented validation in setters to maintain data integrity

# Future Enhancements
* Add payment processing system
* Implement date-based availability checking
* Add user authentication
* Create a GUI interface
* Add database integration
