package com.workingPlatform.schedulemicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "schedule")
@Getter
@Setter
@NoArgsConstructor

public class ScheduleEntity {
    @Id
    private String id;
    private String fecha;
    private String hora_ingreso;
    private String hora_salida;
    private Integer idEmpleado;
}
