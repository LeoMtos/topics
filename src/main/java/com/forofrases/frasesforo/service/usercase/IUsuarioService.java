package com.forofrases.frasesforo.service.usercase;

import java.util.List;
import java.util.Optional;

import com.forofrases.frasesforo.model.dto.ERole;
import com.forofrases.frasesforo.model.dto.UsuarioRequest;


public interface IUsuarioService {

List<UsuarioRequest> getAll();
Optional<UsuarioRequest> findById(Long id);
UsuarioRequest save(UsuarioRequest usuarioDto, ERole role);
Optional<UsuarioRequest> update(UsuarioRequest usuarioDto, Long id);
boolean delete(Long id);


}
