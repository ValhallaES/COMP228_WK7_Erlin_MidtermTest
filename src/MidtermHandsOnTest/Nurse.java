package MidtermHandsOnTest;

public class Nurse extends MedicalStaff{
	private final String shiftType;
	private final double shiftAllowance;
	
	public Nurse(String personId, String name, String phoneNumber, String staffId, String department,
			double monthlySalary, String shiftType, double shiftAllowance) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	@Override
	public String getRoleDescription() {
        return "Nurse";
	}
	@Override
	public double calculateMonthlyCompensation() {
        return monthlySalary + shiftAllowance;
    }
	@Override
	public void displayStaffDetails() {
        System.out.println("--- NURSE DETAILS ---");
        super.displayStaffDetails();
        System.out.println("Shift: " + shiftType);
        System.out.println("Shift Allowance: $" + shiftAllowance);
        System.out.println("Monthly Compensation: $" + calculateMonthlyCompensation());
    }
}

