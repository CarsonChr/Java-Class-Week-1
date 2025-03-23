class FictionalPersonPrinter {
	private final FictionalPerson person;
	
	public FictionalPersonPrinter(FictionalPerson person) {
		this.person = person;
	}
	
	public void printPersonDetails() {
		System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Street Address: " + person.getStreetAddress());
        System.out.println("City: " + person.getCity());
        System.out.println("Zip Code: " + person.getZipCode());
	}
}
