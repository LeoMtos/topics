package com.forofrases.frasesforo.model.repository;

import java.util.List;
import java.util.Optional;

import com.forofrases.frasesforo.model.dto.UsuarioRequest;


public interface IUsuarioRepository {

    List<UsuarioRequest> getAll();
    Optional<UsuarioRequest> findById(Long id);
    UsuarioRequest save(UsuarioRequest usuarioDto);
    void delete(Long id);
 

}
