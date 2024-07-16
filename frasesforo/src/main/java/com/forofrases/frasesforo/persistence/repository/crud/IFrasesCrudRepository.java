package com.forofrases.frasesforo.persistence.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forofrases.frasesforo.persistence.entity.FrasesEntity;

public interface IFrasesCrudRepository extends JpaRepository<FrasesEntity, Long>{

}
