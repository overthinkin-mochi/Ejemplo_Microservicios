package com.workingPlatform.reportmicroservice.controller;


import com.workingPlatform.reportmicroservice.dto.ReportDTO;
import com.workingPlatform.reportmicroservice.entity.ReportEntity;
import com.workingPlatform.reportmicroservice.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/report/")
public class ReportController {

    @Autowired
    private ReportRepository reportRepository;

    @PostMapping
    public String saveReport(@RequestBody ReportDTO reportDTO){

        ReportEntity report = new ReportEntity();

        return "report saved";
    }
}
