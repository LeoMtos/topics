package com.forofrases.frasesforo.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.forofrases.frasesforo.model.dto.UsuarioRequest;
import com.forofrases.frasesforo.model.repository.IUsuarioRepository;
import com.forofrases.frasesforo.persistence.mapper.IUsuarioRequestMapper;
import com.forofrases.frasesforo.persistence.repository.crud.IUsuarioCrudRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class UsuarioRepository implements IUsuarioRepository{

    private final IUsuarioCrudRepository iUsuarioCrudRepository;
    private final IUsuarioRequestMapper iUsuarioMapper;

    @Override
    public List<UsuarioRequest> getAll() {
       return iUsuarioMapper.toUsuariosDto(iUsuarioCrudRepository.findAll());
    }

    @Override
    public Optional<UsuarioRequest> findById(Long id) {
        return iUsuarioCrudRepository.findById(id).map(iUsuarioMapper::toUsuarioDto);
    }

    @Override
    public UsuarioRequest save(UsuarioRequest usuarioDto) {
        return  iUsuarioMapper.toUsuarioDto(iUsuarioCrudRepository.save(iUsuarioMapper.toUsuarioEntity(usuarioDto)));
    }

    @Override
    public void delete(Long id) {
        iUsuarioCrudRepository.deleteById(id);
    }

   
    

}
