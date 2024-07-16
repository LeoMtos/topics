package com.forofrases.frasesforo.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;


import com.forofrases.frasesforo.model.dto.UsuarioRequest;
import com.forofrases.frasesforo.persistence.entity.UsuarioEntity;



@Mapper(componentModel = "spring")
public interface IUsuarioRequestMapper {

    UsuarioRequest toUsuarioDto(UsuarioEntity usuarioEntity);

    UsuarioEntity toUsuarioEntity(UsuarioRequest usuarioDto);

    List<UsuarioRequest> toUsuariosDto(List<UsuarioEntity> usuariosEntityList);
    
}
