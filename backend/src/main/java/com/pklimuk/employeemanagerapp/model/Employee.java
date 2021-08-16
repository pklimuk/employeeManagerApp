package com.pklimuk.employeemanagerapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;
    private String facebookUrl;
    private String twitterUrl;
    private String skypeUrl;

    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode,
                    String facebookUrl, String twitterUrl, String skypeUrl) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
        this.facebookUrl = facebookUrl;
        this.twitterUrl = twitterUrl;
        this.skypeUrl = skypeUrl;
    }
}
