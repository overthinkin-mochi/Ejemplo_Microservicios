package com.workingPlatform.reportmicroservice.dto;

import com.workingPlatform.reportmicroservice.entity.ReportEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class ReportDTO {
    private List<ReportEntity> reportEntity;
}
