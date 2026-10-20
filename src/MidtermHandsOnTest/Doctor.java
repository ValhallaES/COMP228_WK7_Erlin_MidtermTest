package MidtermHandsOnTest;

public class Doctor extends MedicalStaff implements Reportable,Schedulable{
	
	protected final double consultationFee;
	protected int patientsSeen;
	
	public Doctor(String personId, String name, String phoneNumber, String staffId, String department,
			double monthlySalary, double consultationFee, int patientsSeen) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.consultationFee = consultationFee;
		this.patientsSeen = patientsSeen;
	}
	
	@Override
	public String getRoleDescription() {
		return "Doctor";
	}
	
	@Override 
	public double calculateMonthlyCompensation() {
		double perfomanceAllowance = patientsSeen * 20.0;
		return monthlySalary + perfomanceAllowance;
	}
	@Override 
	public void displayStaffDetails() {
		System.out.println("--- DOCTOR DETAILS ---");
		super.displayStaffDetails();
		System.out.println("Patients Seen: " + patientsSeen);
        System.out.println("Standard Consultation Fee: $" + consultationFee);
        System.out.println("Monthly Compensation (incl. bonus): $" + calculateMonthlyCompensation());
	}
	public double calculateConsultationFee() { 
	    return consultationFee; 
	}

	public double calculateConsultationFee(double discount) { 
	    return Math.max(0, consultationFee - discount); 
	}

	public double calculateConsultationFee(double discount, double additionalCharge) { 
	    return Math.max(0, consultationFee - discount + additionalCharge); 
	}
	@Override
	public void generateReport() {
	    System.out.println("Doctor " + name + " is generating a medical report.");
	}

	@Override
	public void scheduleAppointment(String date) {
	    System.out.println("Appointment successfully scheduled with Dr. " + name + " on " + date);
	}
}
