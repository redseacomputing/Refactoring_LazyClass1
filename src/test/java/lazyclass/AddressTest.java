package lazyclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest {

    Address address;
    Address addressUK;

    @BeforeEach
    void setUpAddress() {
        Postcode postcode = new Postcode("0000");
        address = new Address("1", "United Street", "United City", "United Country", postcode);
    }

    @BeforeEach
    void setUpAddressInUnitedKingdom() {
        Postcode postcode = new Postcode("0000");
        addressUK = new Address("1", "United Street", "United City", "United Kingdom", postcode);
    }

    @Test
    void calculatePostage() {
        assertEquals(6d, address.calculatePostage());
    }

    @Test
    void calculatePostageInUK() {
        assertEquals(3d, addressUK.calculatePostage());
    }

    @Test
    void shouldReturnCorrectAddressSummary() {
        String result = "1, United Street, United City, 0000, United Country";
        assertEquals(result, address.getAddressSummary());
    }
}