package lazyclass;

public class Address {

    private final String house;
    private final String street;
    private final String city;
    private final Postcode postcode;
    private final String country;

    public Address(String house, String street, String city,
                   String country, Postcode postcode) {
        this.house = house;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }

    public double calculatePostage() {
        return country.equals("United Kingdom") ? 3 : 6;
    }

    public String getAddressSummary() {
        return house + ", " + street + ", " + city + ", " + postcode.getPostcode() +
                ", " + country;
    }
}