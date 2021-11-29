/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabemailapplication;

import java.util.Scanner;

/**
 *
 * @author MD KALAMUDDIN ANSARI
 * Task of creating credentials for new hires
 */
public class OOpsLabEmailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee("KALAM", "ANSARI");

        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int depOption = scanner.nextInt();
        if (depOption >= 1 && depOption <= 4) {
            CredentialService credService = new CredentialService();
            String depName = "";
            switch (depOption) {
                case 1:
                    depName = "tech";
                    break;
                case 2:
                    depName = "admin";
                    break;
                case 3:
                    depName = "hr";
                    break;
                case 4:
                    depName = "lg";
                    break;
            }
            String email = credService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), depName);
            String passwd = credService.generatePassword();
            credService.showCredentials(employee, email, passwd);

        } else {
            System.out.println("Invalid option selected");
        }

    }

}
