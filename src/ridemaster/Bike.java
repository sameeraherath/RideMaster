/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ridemaster;

/**
 *
 * @author 94764
 */
public class Bike extends Vehicle  {
    
    private int engineCapacity;
    
    public Bike(String vehicleId,String brand,String model,double rentalRate, int engineCapacity){
    
        super(vehicleId,brand,model,rentalRate);
        this.engineCapacity = engineCapacity;
    }
    
    public int getEngineCapacity(){
        
        return engineCapacity;
    }
    
    public void setEngineCapacity(int engineCapacity){
        
        this.engineCapacity = engineCapacity;
   
    }
    
    
    @Override
    public void displayDetails(){
    
     System.out.println("Vehicle ID: " + getVehicleId() + ", Brand: " + getBrand() + ", Model: " + getModel() +
                           ", Rental Rate: $" + getRentalRate() + "/day, Engine Capacity: " + engineCapacity + "cc");   
    }
    
    
}
