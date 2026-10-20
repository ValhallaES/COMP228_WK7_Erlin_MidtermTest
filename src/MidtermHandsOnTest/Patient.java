package MidtermHandsOnTest;

public class Patient extends Person {

	private final String patientNumber;
	private int age;
	private String medicalDepartment;
	private double consultationFee;

	private static int patientCount = 0;

	public Patient(String personId, String name, String phoneNumber, String patientNumber, int age,
			String medicalDepartment, double consultationFee) {
		super(personId, name, phoneNumber);
		this.patientNumber = patientNumber;
		this.consultationFee = consultationFee;

		registerPatient(name, age, medicalDepartment);

		patientCount++;
	}

	public static int getPatientCount() {
		return patientCount;
	}

	@Override
	public String getRoleDescription() {
		return "Patient";
	}

	public void registerPatient(String name, int age) {
		if (name == null || name.trim().isEmpty()){
			System.out.println("Registration Failed: Name cannot be empty.");
			return;
		}
		if(age < 0 || age > 125) {
			System.out.println("Registration Failed: Invalid age for patient " + name);
			return;
		}
		this.name = name; 
        this.age = age;
        this.medicalDepartment = "General Medicine";
	}
	public void registerPatient(String name, int age, String department) {
        if (department == null || department.trim().isEmpty()) {
            System.out.println("Registration Failed: Department cannot be empty.");
            return;
        }
        registerPatient(name, age);
        if (this.age == age) { 
            this.medicalDepartment = department;
            System.out.println("Registration Status: Successful for " + this.name);
        }
    }

	public void displayPatientDetails() {
		System.out.println("Patient Number: " + patientNumber);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + medicalDepartment);
		System.out.println("Consultation Fee: $" + consultationFee);
	}

}
