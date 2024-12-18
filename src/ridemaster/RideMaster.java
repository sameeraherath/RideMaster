/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ridemaster;
import java.util.Scanner;

/**
 *
 * @author 94764
 */
public class RideMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalManager manager = new RentalManager();
        
        while (true){
              
              System.out.println("Welcome to Vehicle Rental Service System");
              System.out.println("----------------------------------------");
              System.out.println("1. Add Customer");
              System.out.println("2. Add Vehicle");
              System.out.println("3. Rent Vehicle");
              System.out.println("4. Return Vehicle");
              System.out.println("5. View Available Vehicles");
              System.out.println("6. Exit");
              System.out.print("Enter your choice: ");
              int choice = scanner.nextInt();
              scanner.nextLine();
              
                      
              switch(choice){
              
                  case 1: // Add Customer
                   System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String contact = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    manager.addCustomer(new Customer(name, contact, email, customerId));
                    break;
                    
                  case 2: // Add Vehicle
                  
                    System.out.print("Enter Vehicle Type (Car/Bike): ");
                    String vehicleType = scanner.nextLine();
                    System.out.print("Enter Vehicle ID: ");
                    String vehicleId = scanner.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Rental Rate: ");
                    double rentalRate = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    
                    if (vehicleType.equalsIgnoreCase("Car")){
                    
                        System.out.println("Enter Seating Capacity: ");
                        int seatingCapacity = scanner.nextInt();
                        scanner.nextLine();  // consume newline
                        System.out.print("Enter Fuel Type: ");
                        String fuelType = scanner.nextLine();
                        manager.addVehicle(new Car(vehicleId, brand, model, rentalRate, seatingCapacity, fuelType));
                        
                    
                    
                    } else if (vehicleType.equalsIgnoreCase("Bike")){
                    
                    System.out.print("Enter Engine Capacity: ");
                    int engineCapacity = scanner.nextInt();
                    scanner.nextLine();
                    manager.addVehicle(new Bike(vehicleId, brand, model, rentalRate, engineCapacity));
               
                    }
                    break;
                 case 3: // Rent Vehicle
                    System.out.print("Enter Customer ID: ");
                    customerId = scanner.nextLine();
                    System.out.print("Enter Vehicle ID: ");
                    vehicleId = scanner.nextLine();
                    System.out.print("Enter Number of Days: ");
                    int days = scanner.nextInt();
                    manager.rentVehicle(vehicleId, customerId, days);
                    break;
                    
                 case 4: // Return Vehicle
                    System.out.print("Enter Vehicle ID: ");
                    vehicleId = scanner.nextLine();
                    manager.returnVehicle(vehicleId);
                    break;
                    
                 case 5: // View Available Vehicles
                    manager.viewAvailableVehicles();
                    break;
                    
                 case 6: // Exit
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
              
              }
    
    
    
    }
        
        
    }
    
}
