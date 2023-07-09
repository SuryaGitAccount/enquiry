package com.franchiseEnquiry.util;

import com.franchiseEnquiry.entity.FranchiseEnquiryForm;
import com.franchiseEnquiry.payload.FranchiseEnquiryFormDTO;
import org.springframework.stereotype.Component;

@Component
public class FranchiseEnquiryFormMapper {

    public FranchiseEnquiryFormDTO toDTO(FranchiseEnquiryForm franchiseEnquiryForm) {
        FranchiseEnquiryFormDTO franchiseEnquiryFormDTO = new FranchiseEnquiryFormDTO();
        franchiseEnquiryFormDTO.setId(franchiseEnquiryForm.getId());
        franchiseEnquiryFormDTO.setFirstName(franchiseEnquiryForm.getFirstName());
        franchiseEnquiryFormDTO.setLastName(franchiseEnquiryForm.getLastName());
        franchiseEnquiryFormDTO.setEmail(franchiseEnquiryForm.getEmail());
        franchiseEnquiryFormDTO.setMobile(franchiseEnquiryForm.getMobile());
        franchiseEnquiryFormDTO.setPincode(franchiseEnquiryForm.getPincode());
        franchiseEnquiryFormDTO.setState(franchiseEnquiryForm.getState());
        franchiseEnquiryFormDTO.setCity(franchiseEnquiryForm.getCity());
        return franchiseEnquiryFormDTO;
    }

    public FranchiseEnquiryForm toEntity(FranchiseEnquiryFormDTO franchiseEnquiryFormDTO) {
        FranchiseEnquiryForm franchiseEnquiryForm = new FranchiseEnquiryForm();
        franchiseEnquiryForm.setId(franchiseEnquiryFormDTO.getId());
        franchiseEnquiryForm.setFirstName(franchiseEnquiryFormDTO.getFirstName());
        franchiseEnquiryForm.setLastName(franchiseEnquiryFormDTO.getLastName());
        franchiseEnquiryForm.setEmail(franchiseEnquiryFormDTO.getEmail());
        franchiseEnquiryForm.setMobile(franchiseEnquiryFormDTO.getMobile());
        franchiseEnquiryForm.setPincode(franchiseEnquiryFormDTO.getPincode());
        franchiseEnquiryForm.setState(franchiseEnquiryFormDTO.getState());
        franchiseEnquiryForm.setCity(franchiseEnquiryFormDTO.getCity());
        return franchiseEnquiryForm;
    }
}

