
package mannimanpreet.assign1;
/**
 * Description: Address class linked with employee class.
 * Date Created: 16-May-2019
 * Author Manpreet Manni
 */
public class Address {
    // declaring data fields
    private int streetNumber;
    private String streetName;
    private String cityName;
    private String provinceName;
    private String postalCode;
    private String countryName;
    
    // no arg constructor that uses this keyword to call the argumented 
    //constructor
    public Address(){
        this(0, "", "", "", "", "");
    }

    // argumented constructor to create Address objects.
    public Address(int streetNumber, String streetName, String cityName, 
            String provinceName, String postalCode, String countryName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.postalCode = postalCode;
        this.countryName = countryName;
    }

    // getter methods.
    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public String getCountryName() {
        return countryName;
    }

    // setter methods.
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    //overriding toString method to display information about employee's address 
    public String toString(){
        return getStreetNumber() + " " + getStreetName() + " (" + getPostalCode()  
                 + "), " + getCityName() + ", " + getProvinceName() + ", " +
                getCountryName();
    }
}
