package net.ukr.dreamsicle.Task2;

/**
 * Created by Yura on 22.04.2017.
 */
public class Address {
    private final String country;
    private final String city;
    private final String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address[ " +
                "\n\t country: " + country +
                ", \n\t city: " + city +
                "; \n\t street: " + street +
                ']';
    }
}
