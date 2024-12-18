/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ridemaster;

/**
 *
 * @author 94764
 */
public class Car extends Vehicle {
    
    private int seatingCapacity;
    private String fuelType;
    
    public Car(String vehicleId,String brand,String model,double rentalRate,int seatingCapacity,String fuelType){
    
        super(vehicleId,brand,model,rentalRate);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    
    
    public int getSeatingCapacity() {
        
        return seatingCapacity;
    }
    
    public void setSeatingCapacity(int seatingCapacity){
          
        this.seatingCapacity = seatingCapacity;
    }
    
    public String getFuelType(){
        
        return fuelType;
    }
    
    public void setFuelType(String fuelType){
        
        this.fuelType = fuelType;
    }
    
    @Override
    public void displayDetails(){
        
        System.out.println("Vehicle ID: " + getVehicleId() + ",Brand: " + getBrand() + ",Model: " + getModel() + ", Rental Rate: $" + getRentalRate() + "/day,Seating Capacity: " + seatingCapacity + ",Fuel Type: " + fuelType);
    
    }
}
