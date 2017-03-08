package com.galvanize;

import java.util.List;

/**
 * Created by Paul Ganster on 3/7/2017.
 */
public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
