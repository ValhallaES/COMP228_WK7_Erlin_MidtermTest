package MidtermHandsOnTest;

public abstract class Person {
	
	protected final String personId;
	protected String name;
	protected String  phoneNumber;
	protected static int personCount = 0;
	
	public Person(String personId, String name, String phoneNumber) {
		
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Registration Failed:Name cannot be empty.");
		}
		
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
	}
	public static int getPersonCount() {
		return personCount;
	}
	public void displayBassicDetails() {
		System.out.println("Person ID: " + personId + "Name :" + name + "Phone: "+ phoneNumber);
	}
	public abstract String getRoleDescription();
	
	@Override
	
	public String toString() {
		return "[" + getRoleDescription() + "] ID: " + personId + " - " + name;
	}
}
