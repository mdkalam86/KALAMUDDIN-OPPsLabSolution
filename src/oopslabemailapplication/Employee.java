/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabemailapplication;

/**
 *
 * @author mdkal
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    
    public Employee(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
