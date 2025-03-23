
public class FictionalPerson {
	// All fields...
	private final String firstName;
    private final String lastName;
    private final String streetAddress;
    private final String city;
    private final String zipCode;

    // Private constructor forcing builder...
    private FictionalPerson(FictionalPersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }

    // Public getters...
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getZipCode() { return zipCode; }

    // Builder.
    static class FictionalPersonBuilder {
        private String firstName;
        private String lastName;
        private String streetAddress;
        private String city;
        private String zipCode;

        public FictionalPersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public FictionalPersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public FictionalPersonBuilder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public FictionalPersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public FictionalPersonBuilder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public FictionalPerson build() {
            if (firstName == null || lastName == null || streetAddress == null || city == null || zipCode == null) {
                throw new IllegalStateException("Missing required fields in FictionalPersonBuilder");
            }
            return new FictionalPerson(this);
        }
    }
}
