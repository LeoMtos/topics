package com.forofrases.frasesforo.model.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor


public class TopicResponse {

    private Long id;

    private String titulo;

    private String mensaje;
    
    private LocalDate fechaCreacion;
}
