/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabemailapplication;

import java.util.Random;

/**
 *
 * @author mdkal
 */
public class CredentialService {

    /**
     * Generate an email with the following syntax firstNamelastName@department.company.com

     * @param firstname
     * @param lastname
     * @param department
     * @return emailaddress
     */
    public String generateEmailAddress(String firstname, String lastname, String department) {
        return firstname.toLowerCase() + lastname.toLowerCase() + "@" + department.toLowerCase() + ".abc.com";
    }

    /**
     * Generate a random password which will contain (number, capital letter, small letter & special character)
     * @return password
     */
    
    public String generatePassword() {
        String numbers = "1234567890";
        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specials = "~!@#$%^&*()_-<>?";

        String values = numbers + capitals + capitals.toLowerCase() + specials;
        Random random = new Random();
        String password = "";

        for (int i = 0; i < 8; i++) {
            password += values.charAt(random.nextInt(values.length()));
        }

        return password;
    }

    /**
     * Display the generated credentials
     * @param employee
     * @param emailaddress
     * @param password 
     */
    public void showCredentials(Employee employee, String emailaddress, String password) {
        System.out.println();
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email ---> " + emailaddress);
        System.out.println("Password ---> " + password);
    }

}
