package com.workingPlatform.schedulemicroservice.controller;

import com.workingPlatform.schedulemicroservice.entity.ScheduleEntity;
import com.workingPlatform.schedulemicroservice.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ScheduleEntity> getAllSchedule(){
        return scheduleRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createSchedule(@RequestBody ScheduleEntity scheduleEntity){
        scheduleRepository.save(scheduleEntity);
    }
}
