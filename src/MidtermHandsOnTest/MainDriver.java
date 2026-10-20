package MidtermHandsOnTest;

public class MainDriver {
	public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("CAREPOINT HOSPITAL");
        System.out.println("MANAGEMENT SYSTEM");
        System.out.println("========================================");

        System.out.println("\n--- PATIENT REGISTRATION ---");
        Patient p1 = new Patient("P-001", "Priya Sharma", "555-0101", "P1001", 35, "Cardiology", 0.0);
        Patient p2 = new Patient("P-002", "Daniel Brown", "555-0102", "P1002", 42, "General Medicine", 0.0);
        
        System.out.println("\nAttempting invalid registration:");
        Patient p3 = new Patient("P-003", "Invalid Patient", "555-0000", "P1003", -5, "Unknown", 0.0);
        System.out.println("\nAttempting invalid registration (Empty Name):");
        try {
            Patient p4 = new Patient("P-004", "", "555-0000", "PT1004", 30, "General", 0.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n--- PATIENT DETAILS ---");
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();

        Doctor doctor = new Doctor("S-001", "Dr. Amit Kumar", "555-0201", "D2001", "Cardiology", 9000.0, 150.0, 100);
        SpecialistDoctor specialist = new SpecialistDoctor("S-002", "Dr. Neha Patel", "555-0202", "D2002", "Neurology", 11000.0, 150.0, 60, "Neurology", 50.0);
        Nurse nurse = new Nurse("S-003", "Sarah Wilson", "555-0301", "N3001", "Emergency", 5000.0, "Night", 500.0);

        System.out.println("\n--- MEDICAL STAFF DETAILS (RUNTIME POLYMORPHISM) ---");
        MedicalStaff[] hospitalStaff = { doctor, specialist, nurse };
        
        for (MedicalStaff staff : hospitalStaff) {
            staff.displayStaffDetails(); 
            System.out.println();
        }

        System.out.println("--- CONSULTATION FEE CALCULATIONS (OVERLOADING) ---");
        System.out.println("Dr. Kumar Standard Fee: $" + doctor.calculateConsultationFee());
        System.out.println("Dr. Kumar Fee with $20 Discount: $" + doctor.calculateConsultationFee(20.0));
        System.out.println("Dr. Kumar Fee with $20 Discount & $50 Extra Charge: $" + doctor.calculateConsultationFee(20.0, 50.0));
        System.out.println("Dr. Patel (Specialist) Fee with Surcharge: $" + specialist.calculateConsultationFee());

        System.out.println("\n--- INTERFACE DEMONSTRATION ---");
        doctor.generateReport();
        doctor.scheduleAppointment("Oct 25, 2026 10:00 AM");
        
        System.out.println("\n========================================");
        System.out.println("REGISTRATION SUMMARY");
        System.out.println("========================================");
        System.out.println("Total People in System: " + Person.getPersonCount());
        System.out.println("Total Patients Registered: " + Patient.getPatientCount());
        System.out.println("Total Medical Staff Created: " + MedicalStaff.getStaffCount());
        System.out.println("========================================");
        System.out.println("END OF REPORT");
        System.out.println("========================================");
    }
}

