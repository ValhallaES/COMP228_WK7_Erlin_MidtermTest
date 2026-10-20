package MidtermHandsOnTest;

public class SpecialistDoctor extends Doctor{
	
	private final String specialization;
	private final double specialistSurcharge;
	
	public SpecialistDoctor(String personId, String name, String phoneNumber, String staffId, String department,
			double monthlySalary, double consultationFee, int patientsSeen, String specialization,
			double specialistSurcharge) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary, consultationFee, patientsSeen);
		this.specialization = specialization;
		this.specialistSurcharge = specialistSurcharge;
	}

	@Override
	public String getRoleDescription() {
		return "Specialist Doctor";
	}
	@Override
	public double calculateConsultationFee() {
		return consultationFee + specialistSurcharge;
	}
	
	@Override
	public double calculateMonthlyCompensation() {
        double specialistBonus = patientsSeen * 60.0;
        return monthlySalary + specialistBonus;
    }
	@Override
    public void displayStaffDetails() {
        System.out.println("--- SPECIALIST DOCTOR DETAILS ---");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
        System.out.println("Patients Seen: " + patientsSeen);
        System.out.println("Consultation Fee (incl. Surcharge): $" + calculateConsultationFee());
        System.out.println("Monthly Compensation: $" + calculateMonthlyCompensation());
    }
}
