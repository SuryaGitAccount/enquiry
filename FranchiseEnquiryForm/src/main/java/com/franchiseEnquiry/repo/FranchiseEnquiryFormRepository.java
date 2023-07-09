package com.franchiseEnquiry.repo;

import com.franchiseEnquiry.entity.FranchiseEnquiryForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchiseEnquiryFormRepository extends JpaRepository<FranchiseEnquiryForm, Long> {
    // You can add custom query methods here if needed
}

