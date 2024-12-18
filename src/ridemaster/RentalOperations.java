/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ridemaster;

/**
 *
 * @author 94764
 */
public interface RentalOperations {
        
    void rentVehicle(String vehicleId,String customerId,int days);
    void returnVehicle(String vehicleId);
    void viewAvailableVehicles();   
}
