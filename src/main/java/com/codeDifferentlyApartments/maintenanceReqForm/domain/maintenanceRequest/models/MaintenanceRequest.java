package com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity //JPA to save to the database
//@NoArgsConstructor //Generate our Non argument constructors
@RequiredArgsConstructor //Generate our parametrized constructors
@Data //Generate all getters and setters
public class MaintenanceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    @NonNull
    private String aptNumber;

    @NonNull
    private String description;

    @NonNull
    private localDate createdAt;

    public String toString(){
        return String.format("%d %s %s %s %s %s %d %s  ", id,firstName,lastName,email,aptNumber,description,createdAt);
        String output = localDate.toString();
    }

}
