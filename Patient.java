/*
 * Class: CMSC203
 * Instructor: T
 * Description: This class represents a patient with fields for personal information such as name, address, phone number, and emergency contact.
 * Due: 10/03/2024
 * Platform/compiler: IntelliJ IDEA
 *
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 *
 * Print your Name here: G.Araya
 */
public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // Constructor with all fields
    public Patient(String firstName, String middleName, String lastName, String streetAddress,
                   String city, String state, String zipCode, String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessor methods
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmergencyContactName() { return emergencyContactName; }
    public String getEmergencyContactPhone() { return emergencyContactPhone; }

    // Mutator methods
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }

    // Methods to build concatenated strings
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + ", " + city + ", " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyContactName + " (" + emergencyContactPhone + ")";
    }

    // toString method to display all patient information
    @Override
    public String toString() {
        return "Patient Information:\n" +
                "Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }
}
