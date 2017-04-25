package net.ukr.dreamsicle.Home2Task2;

import java.util.List;

/**
 * Created by Yura on 22.04.2017.
 */
public class Human {
    private final String name;
    private final String surname;
    private final List<Integer> phones;
    private final List<String> sites;
    private final Address address;

    public Human(String name, String surname, List<Integer> phones, List<String> sites, Address address) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.sites = sites;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Integer> getPhones() {
        return phones;
    }

    public List<String> getSites() {
        return sites;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return " name: " + name + "; \n surname: " + surname +"; \n phones: " + phones + "; \n sites: " + sites +"; \n address: " + address;
    }
}
