/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ridemaster;

/**
 *
 * @author 94764
 */
public class Customer {
    
    private String name;
    private String contactNumber;
    private String email;
    private String customerId;
    
    public Customer(String name,String contactNumber,String email,String customerId){
        
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.customerId = customerId;
    
    }
    
    // Getters and setters
    public String getName() {
        
        return name;
    
    }
    
    public void setName(String name){
        
        this.name = name;
    
    
    }
    
    public String getContactNumber(){
        
        return contactNumber;
    
    }
    
    public void setContactNumber(String contactNumber){
        
        
        this.contactNumber = contactNumber;   
    
    }
    
    public String getEmail() {
        
        return email;
    
    }
    
    public void setEmail(String email){
        
        this.email = email;
    
    }
    
    public String getCustomerId(){
        
        return customerId;   
    }
    
    public void setCustomerId(String customerId){
        
        
        this.customerId = customerId;
        
    }
    
    @Override
    public String toString(){
    
     return "Name: " + name + ", Contact: " + contactNumber + ", Email: " + email + ", ID: " + customerId;
    
    }
    
}
