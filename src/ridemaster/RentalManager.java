/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ridemaster;
import java.util.*;

/**
 *
 * @author 94764
 */
public class RentalManager implements RentalOperations {
    
    private Map<String, Customer> customers = new HashMap<>();
    private Map<String, Vehicle> vehicles = new HashMap<>();

    @Override
    public void rentVehicle(String vehicleId, String customerId, int days) {
        Vehicle vehicle = vehicles.get(vehicleId);
        if (vehicle != null && !vehicle.isRented()) {
            vehicle.setRented(true);
            System.out.println("Vehicle rented successfully for " + days + " days!");
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
    }

    @Override
    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = vehicles.get(vehicleId);
        if (vehicle != null && vehicle.isRented()) {
            vehicle.setRented(false);
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("This vehicle was not rented.");
        }
    }

    @Override
    public void viewAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicles.values()) {
            if (!vehicle.isRented()) {
                vehicle.displayDetails();
            }
        }
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
        System.out.println("Customer added successfully!");
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getVehicleId(), vehicle);
        System.out.println("Vehicle added successfully!");
    }
    
}
