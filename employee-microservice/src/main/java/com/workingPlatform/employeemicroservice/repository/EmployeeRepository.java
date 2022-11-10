package com.workingPlatform.employeemicroservice.repository;

import com.workingPlatform.employeemicroservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
