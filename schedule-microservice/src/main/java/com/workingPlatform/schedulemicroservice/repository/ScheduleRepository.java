package com.workingPlatform.schedulemicroservice.repository;

import com.workingPlatform.schedulemicroservice.entity.ScheduleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepository extends MongoRepository<ScheduleEntity, String> {

}
