package com.forofrases.frasesforo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class TopicRequest {

    private Long id;

    private String mensaje;

    private String nombreCurso;
    
    private String titulo;

}
