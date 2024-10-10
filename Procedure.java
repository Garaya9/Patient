/*
 * Class: CMSC203
 * Instructor: T
 * Description: This class represents a medical procedure with fields for procedure name, date, practitioner, and charges.
 * Due: 10/03/2024
 * Platform/compiler: IntelliJ IDEA
 *
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 *
 * Print your Name here: G.Araya
 */
public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    // Constructor with all fields
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessor methods
    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    // Mutator methods
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    public void setCharges(double charges) { this.charges = charges; }

    // toString method to display all procedure information
    @Override
    public String toString() {
        return "Procedure Name: " + procedureName + "\t" +
                "Date: " + procedureDate + "\t" +
                "Practitioner: " + practitionerName + "\t" +
                "Charges: $" + String.format("%.2f", charges);
    }
}

