package com.example.VendorAPI.controller;

import com.example.VendorAPI.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class VendorAPIService {

    Vendor vendor;

    @GetMapping("{vendorId}")
    public Vendor getVendorDetails() {
        return vendor;
                //("One", "Vendor 1",
                //"Vendor address", "xxxxx");
    }
    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor) {
        this.vendor = vendor;
        return "Vendor detail has created";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor) {
        this.vendor = vendor;
        return "Vendor detail has updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(String vendorId) {
        this.vendor = null;
        return "Vendor detail has deleted";
    }
}

