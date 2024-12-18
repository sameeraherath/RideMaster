/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ridemaster;

/**
 *
 * @author 94764
 */
public abstract class Vehicle {
    
    
    private String vehicleId;
    private String brand;
    private String model;
    private double rentalRate;
    private boolean isRented;
    
    public Vehicle(String vehicleId,String brand,String model,double rentalRate){
        
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalRate = rentalRate;
        this.isRented = false;
    }
    
    public String getVehicleId(){
        
        return vehicleId;
    } 
    
    public void setVehicleId(String vehicleId){
        
        this.vehicleId = vehicleId;
    
    
    }
    
    public String getBrand(){
        
        return brand; 
    }
    
    public void setBrand(String brand){
        
        this.brand = brand;
    
    }
    
    public String getModel(){
        
        return model;
    }
    
    public void setModel(String model){
        
        this.model = model;
    
    
    }
    
    public double getRentalRate() {
        
        return this.rentalRate = rentalRate;
    
    
    }
    
    public void setRentalRate(double rentalRate){
        
        this.rentalRate = rentalRate;
    
    
    }
    
    public boolean isRented() {
        
        return isRented;
    
    
    }
    
    public void setRented(boolean rented){
        
        isRented = rented;
    
    
    }
    
    public abstract void displayDetails();
    
}
    
