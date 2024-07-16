package com.forofrases.frasesforo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.forofrases.frasesforo.model.dto.ERole;
import com.forofrases.frasesforo.model.dto.UsuarioRequest;
import com.forofrases.frasesforo.model.repository.IUsuarioRepository;
import com.forofrases.frasesforo.service.usercase.IUsuarioService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService implements IUsuarioService{
    
    private final IUsuarioRepository iUsuarioRepository;
 

    @Override
    public List<UsuarioRequest> getAll() {
           
       return iUsuarioRepository.getAll();
    }

    @Override
    public Optional<UsuarioRequest> findById(Long id) {
        return iUsuarioRepository.findById(id);
    }



    @Override
    public UsuarioRequest save(UsuarioRequest usuarioDto, ERole role) {
        usuarioDto.setRole(role);
        UsuarioRequest usuarioDto2 = iUsuarioRepository.save(usuarioDto);
       
    return usuarioDto2;
    }

    @Override
    public Optional<UsuarioRequest> update(UsuarioRequest usuarioDto, Long id) {

        if (iUsuarioRepository.findById(id).isEmpty()) {
            return Optional.empty();
        }
        usuarioDto.setId(id);
        return Optional.of(iUsuarioRepository.save(usuarioDto));
    }

    @Override
    public boolean delete(Long id) {
        Optional<UsuarioRequest> usuOptional= iUsuarioRepository.findById(id);

        if( usuOptional.isPresent()){
            iUsuarioRepository.delete(id);
            return true;
        }
        return false;
    }

    

}
