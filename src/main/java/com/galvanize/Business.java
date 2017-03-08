package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Ganster on 3/7/2017.
 */
public class Business implements Addressable {
    private final String name;

    private final List<Address> addresses = new ArrayList<>();

    public Business(String name) {
        this.name = name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    public String getName() {
        return name;
    }
}
