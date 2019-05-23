
package mannimanpreet.assign1;
import java.util.Date;

/**
 *  Description: Employee class that creates employee object and also includes 
                 methods to print object's informations.
 *  Date Created: 16-May-2019
 *  Author Manpreet Manni
 */

public class Employee {
    // declaring data fields
    private String employeeFirstName;
    private String employeeLastName;
    private Address employeeAddress;
    private String employeeEmail;
    private long employeePhoneNumber;
    private String employeeStatus;
    private final Date dateHired;
    private double employeeSalary;

    // no arg constructor to give default values to the data fields
    public Employee(){
        this("", "", "", 0, "", 0.0);
    }
    
    // argumented constructor to set user entered values.
    public Employee(String employeeFirstName, String employeeLastName, 
            String employeeEmail, long employeePhoneNumber, 
            String employeeStatus, double employeeSalary) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeStatus = employeeStatus;
        this.dateHired = new Date();
        this.employeeAddress = new Address();
        this.employeeSalary = employeeSalary;
    }
    
    // getter methods 
    public Date getDateHired(){
        return this.dateHired;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }
    
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    
    public long getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }
    
    public double getEmployeeSalary() {
        return employeeSalary;
    }

    // setter methods
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
    
    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }


    public void setEmployeePhoneNumber(long employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    
    // as there are approx. 52 weeks in a year, so biweekly will be equal to 
    // total salary divided by 26.
    public double getBiweeklySalary(){
        return this.employeeSalary / 26;
    }
    
    // representing string in the specified format.
    public String toString(){
        return String.format("%-15s%-15s%-30s%,8.2f", this.employeeFirstName, 
                this.employeeLastName, this.employeeEmail, getBiweeklySalary());
    }
    
}
