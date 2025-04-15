package com.example.internetprovidermanagement.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class UserDetailsDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String landLine;
    private String phone;
    private LocationDTO location;
    private List<UserBundleDetailsDTO> bundles;
    private LocalDate subscriptionDate;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}