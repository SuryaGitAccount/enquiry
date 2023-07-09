package com.franchiseEnquiry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "franchise_enquiry_form")
public class FranchiseEnquiryForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;
}