package com.franchiseEnquiry.controller;

import com.franchiseEnquiry.payload.FranchiseEnquiryFormDTO;
import com.franchiseEnquiry.service.FranchiseEnquiryFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/franchise-enquiry")
public class FranchiseEnquiryFormController {

    private final FranchiseEnquiryFormService franchiseEnquiryFormService;

    @Autowired
    public FranchiseEnquiryFormController(FranchiseEnquiryFormService franchiseEnquiryFormService) {
        this.franchiseEnquiryFormService = franchiseEnquiryFormService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveFranchiseEnquiryForm(@Validated @RequestBody FranchiseEnquiryFormDTO franchiseEnquiryFormDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Return validation errors
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        }
        FranchiseEnquiryFormDTO savedForm = franchiseEnquiryFormService.saveFranchiseEnquiryForm(franchiseEnquiryFormDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedForm);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FranchiseEnquiryFormDTO> getFranchiseEnquiryFormById(@PathVariable("id") Long id) {
        FranchiseEnquiryFormDTO form = franchiseEnquiryFormService.getFranchiseEnquiryFormById(id);
        return ResponseEntity.ok(form);
    }

    @GetMapping("/all")
    public ResponseEntity<List<FranchiseEnquiryFormDTO>> getAllFranchiseEnquiryForms() {
        List<FranchiseEnquiryFormDTO> forms = franchiseEnquiryFormService.getAllFranchiseEnquiryForms();
        return ResponseEntity.ok(forms);
    }
}

