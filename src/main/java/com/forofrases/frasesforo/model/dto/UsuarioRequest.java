package com.forofrases.frasesforo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioRequest {

    private Long id;
    private String nombreUsuario;
    private String email;
    private String contrasenia;
    private ERole role;
    

}
