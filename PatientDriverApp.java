/*
 * Class: CMSC203
 * Instructor: T
 * Description: This class is the driver program that manages Patient and Procedure objects.
 * Due: 10/03/2024
 * Platform/compiler: IntelliJ IDEA
 *
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 *
 * Print your Name here: G.Araya
 */
import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather patient information
        System.out.println("Enter patient details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Street Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP Code: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyName = scanner.nextLine();
        System.out.print("Emergency Contact Phone: ");
        String emergencyPhone = scanner.nextLine();

        // Create Patient object
        Patient patient = new Patient(firstName, middleName, lastName, address, city, state, zip, phone, emergencyName, emergencyPhone);

        // Get number of procedures (between 1 and 3)
        System.out.print("How many procedures does the patient have (1-3)?: ");
        int numProcedures = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Procedure[] procedures = new Procedure[numProcedures];

        for (int i = 0; i < numProcedures; i++) {
            System.out.println("Enter details for Procedure #" + (i + 1));

            System.out.print("Procedure Name: ");
            String procedureName = scanner.nextLine();

            System.out.print("Procedure Date (MM/DD/YYYY): ");
            String procedureDate = scanner.nextLine();

            System.out.print("Practitioner Name: ");
            String practitionerName = scanner.nextLine();

            // Input validation for charges (must be positive and nonzero)
            double charges;
            do {
                System.out.print("Charges (must be positive and nonzero): ");
                charges = scanner.nextDouble();
                if (charges <= 0) {
                    System.out.println("Invalid input. Charges must be greater than zero.");
                }
            } while (charges <= 0);  // Repeat until a valid charge is entered
            scanner.nextLine();  // Consume the leftover newline

            // Create Procedure object and add it to the array
            procedures[i] = new Procedure(procedureName, procedureDate, practitionerName, charges);
        }

        // Display patient information
        displayPatient(patient);

        // Display procedure information and calculate total charges
        double totalCharges = calculateTotalCharges(procedures);
        for (Procedure procedure : procedures) {
            displayProcedure(procedure);
        }

        // Display total charges
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        // Display developer info
        System.out.println("The program was developed by a Student: Gebrella Araya 10/03/2024");
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Info:");
        System.out.println("Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Phone: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println("\nProcedure: " + procedure.getProcedureName());
        System.out.println("Procedure Date: " + procedure.getProcedureDate());
        System.out.println("Procedure Practitioner: " + procedure.getPractitionerName());
        System.out.printf("Charges: $%,.2f%n", procedure.getCharges());
    }

    // Method to calculate total charges from an array of procedures
    public static double calculateTotalCharges(Procedure[] procedures) {
        double total = 0;
        for (Procedure procedure : procedures) {
            total += procedure.getCharges();
        }
        return total;
    }
}

