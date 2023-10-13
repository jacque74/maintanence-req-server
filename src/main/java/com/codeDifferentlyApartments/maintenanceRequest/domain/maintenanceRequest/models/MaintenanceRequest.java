package com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity //JPA to save to the database
@NoArgsConstructor //Generate our Non argument constructors
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdAt;

    public String toString(){
        return String.format("%d %s %s %s %s %s %d %s  ", id,firstName,lastName,email,aptNumber,description,createdAt);

    }

}
