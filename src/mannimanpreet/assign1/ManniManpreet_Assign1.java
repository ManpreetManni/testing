package mannimanpreet.assign1;

import java.util.Scanner;

/**
 * Description: Tester for Employee and Address class.
 * Date Created: 16-May-2019
 * Author Manpreet Manni
 */

public class ManniManpreet_Assign1 {
    public static void main(String[] args) {
        // creating an array of Employee Class.
        Employee[] arrayOfEmployee = new Employee[10];
        
        // declaring and initializing Scanner object to take user inputs.
        Scanner input = new Scanner(System.in);
        
        // loop to take inputs and populate employee array using setter methods.
        for(int i = 0; i < arrayOfEmployee.length; i++){
            // creating employee object and prompting user for inputs.
            Employee employee = new Employee();
            
            System.out.print("Enter employee " + (i + 1) + 
                    "'s first and last name: ");
            String firstName = input.next();
            employee.setEmployeeFirstName(firstName);
            String lastName = input.next();
            employee.setEmployeeLastName(lastName);
            
            System.out.print("Enter e-mail address: ");
            String employeeEmail = input.next();
            employee.setEmployeeEmail(employeeEmail);
            
            System.out.print("Enter mobile number: ");
            long employeePhoneNumber = input.nextLong();
            employee.setEmployeePhoneNumber(employeePhoneNumber);
            
            System.out.print("Enter status (contract/salaried): ");
            String employeeStatus = input.next();
            employee.setEmployeeStatus(employeeStatus);
            
            System.out.print("Enter Salary: $");
            long employeeSalary = input.nextLong();
            employee.setEmployeeSalary(employeeSalary);
            
            // for address information.
            
            // creating Address object and prompting user for inputs.
            Address employeeAddress = new Address();
            
            System.out.print("Enter street number: ");
            int streetNumber = input.nextInt();
            employeeAddress.setStreetNumber(streetNumber);
            input.nextLine();
            
            System.out.print("Enter street name: ");
            String streetName = input.nextLine();
            employeeAddress.setStreetName(streetName);
            
            System.out.print("Enter city name: ");
            String cityName = input.nextLine();
            employeeAddress.setCityName(cityName);
            
            System.out.print("Enter province name: ");
            String provinceName = input.nextLine();
            employeeAddress.setProvinceName(provinceName);
            
            System.out.print("Enter postal Code: ");
            String postalCode = input.nextLine();
            employeeAddress.setPostalCode(postalCode);
            
            System.out.print("Enter country name: ");
            String countryName = input.nextLine();
            employeeAddress.setCountryName(countryName);
            
            // setting employeeAddress object as a attribute to the employee 
            //class' data field
            employee.setEmployeeAddress(employeeAddress);
            
            // assigning employee object to array using index.
            arrayOfEmployee[i] = employee;
        }
       
        // for header of the output.
        System.out.printf("%-15s%-15s%-30s%8s%n", "First Name", "Last Name", 
                "Email Address", "Salary (Bi-weekly)");
        
        // loop to print information of each employee.
        for(int i = 0; i < arrayOfEmployee.length; i++){
            System.out.println(arrayOfEmployee[i].toString());
        }
        
    }
}
