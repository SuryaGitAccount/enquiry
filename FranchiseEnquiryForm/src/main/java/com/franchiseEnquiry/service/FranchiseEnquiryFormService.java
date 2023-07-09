package com.franchiseEnquiry.service;

import com.franchiseEnquiry.payload.FranchiseEnquiryFormDTO;

import java.util.List;

public interface FranchiseEnquiryFormService {

    FranchiseEnquiryFormDTO saveFranchiseEnquiryForm(FranchiseEnquiryFormDTO franchiseEnquiryFormDTO);

    FranchiseEnquiryFormDTO getFranchiseEnquiryFormById(Long id);

    List<FranchiseEnquiryFormDTO> getAllFranchiseEnquiryForms();

}

