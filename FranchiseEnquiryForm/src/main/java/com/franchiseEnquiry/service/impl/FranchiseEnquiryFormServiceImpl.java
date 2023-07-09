package com.franchiseEnquiry.service.impl;

import com.franchiseEnquiry.entity.FranchiseEnquiryForm;
import com.franchiseEnquiry.payload.FranchiseEnquiryFormDTO;
import com.franchiseEnquiry.repo.FranchiseEnquiryFormRepository;
import com.franchiseEnquiry.service.FranchiseEnquiryFormService;
import com.franchiseEnquiry.util.FranchiseEnquiryFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class FranchiseEnquiryFormServiceImpl implements FranchiseEnquiryFormService {

    private final FranchiseEnquiryFormRepository franchiseEnquiryFormRepository;
    private final FranchiseEnquiryFormMapper franchiseEnquiryFormMapper;

    @Autowired
    public FranchiseEnquiryFormServiceImpl(FranchiseEnquiryFormRepository franchiseEnquiryFormRepository,
                                           FranchiseEnquiryFormMapper franchiseEnquiryFormMapper) {
        this.franchiseEnquiryFormRepository = franchiseEnquiryFormRepository;
        this.franchiseEnquiryFormMapper = franchiseEnquiryFormMapper;
    }

    @Override
    public FranchiseEnquiryFormDTO saveFranchiseEnquiryForm(FranchiseEnquiryFormDTO franchiseEnquiryFormDTO) {
        FranchiseEnquiryForm franchiseEnquiryForm = franchiseEnquiryFormMapper.toEntity(franchiseEnquiryFormDTO);
        franchiseEnquiryForm = franchiseEnquiryFormRepository.save(franchiseEnquiryForm);
        return franchiseEnquiryFormMapper.toDTO(franchiseEnquiryForm);
    }

    @Override
    public FranchiseEnquiryFormDTO getFranchiseEnquiryFormById(Long id) {
        FranchiseEnquiryForm franchiseEnquiryForm = franchiseEnquiryFormRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Franchise Enquiry Form not found with id: " + id));
        return franchiseEnquiryFormMapper.toDTO(franchiseEnquiryForm);
    }

    @Override
    public List<FranchiseEnquiryFormDTO> getAllFranchiseEnquiryForms() {
        List<FranchiseEnquiryForm> franchiseEnquiryForms = franchiseEnquiryFormRepository.findAll();
        return franchiseEnquiryForms.stream()
                .map(franchiseEnquiryFormMapper::toDTO)
                .collect(Collectors.toList());
    }
}

