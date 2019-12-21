package com.serheev;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ValidationServiceTest {

    @Test
    public void shouldValidateDateCorreclty() {
        String[] dates = {"30-10-2019", "01-10-2020", "30-10-2019", "01-11-2018"};
        Arrays.asList(dates).stream().forEach(n -> assertEquals(true, new ValidationService().isValidDate(n)));
    }

    @Test
    public void shouldValidateIP4Correclty() {
        String[] strings = {"0.0.0.0", "255.255.255.255", "192.168.88.1", "127.0.0.1"};
        Arrays.asList(strings).stream().forEach(n -> assertEquals(true, new ValidationService().isValidIP4(n)));
    }
}