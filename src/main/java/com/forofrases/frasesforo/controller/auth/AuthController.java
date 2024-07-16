package com.forofrases.frasesforo.controller.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forofrases.frasesforo.model.dto.ERole;
import com.forofrases.frasesforo.model.dto.UsuarioRequest;
import com.forofrases.frasesforo.service.usercase.IUsuarioService;

import lombok.RequiredArgsConstructor;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor

@RestController
@RequestMapping("api/v1/register")
public class AuthController {
    private final IUsuarioService iUsuarioService;

    @PostMapping("/{role}")
    public ResponseEntity<UsuarioRequest> registerMedico(@RequestBody UsuarioRequest usuarioDto, @PathVariable ERole role) {
        return ResponseEntity.ok( iUsuarioService.save(usuarioDto, role));
    }

}
