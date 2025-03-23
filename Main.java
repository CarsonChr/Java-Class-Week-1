
public class Main {
	public static void main(String[] args) {
		// Create fictional person
		FictionalPerson person = new FictionalPerson.FictionalPersonBuilder()
				.setFirstName("Carson")
				.setLastName("Christopherson")
				.setStreetAddress("13229 Piney Lake Rd.")
				.setCity("Parker")
				.setZipCode("80138")
				.build();
		
		// Create printer
		FictionalPersonPrinter printer = new FictionalPersonPrinter(person);
		
		// Print...
		printer.printPersonDetails();
	}
}
