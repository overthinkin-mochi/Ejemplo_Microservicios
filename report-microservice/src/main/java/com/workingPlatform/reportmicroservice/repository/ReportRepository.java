package com.workingPlatform.reportmicroservice.repository;

import com.workingPlatform.reportmicroservice.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository  extends JpaRepository <ReportEntity, Long>{

}
