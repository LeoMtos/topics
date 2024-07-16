package com.forofrases.frasesforo.persistence.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forofrases.frasesforo.persistence.entity.UsuarioEntity;

public interface IUsuarioCrudRepository extends JpaRepository<UsuarioEntity, Long>{

}
