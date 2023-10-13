package com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaintenanceRequestTest {

    @Test
    public void constructorTest01(){
        MaintenanceRequest maintenanceRequest= new MaintenanceRequest("Demo", "User","demo@user.com", "Demo1", "Demo2", "Demo3");
        maintenanceRequest.setId(1L);

        String expected = "1 Demo User demo@user.com Demo1 Demo2 Demo3";
        String actual = maintenanceRequest.toString();


        Assertions.assertEquals(expected, actual);
    }
}
