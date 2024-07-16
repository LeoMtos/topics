package com.forofrases.frasesforo.persistence.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forofrases.frasesforo.persistence.entity.TopicEntity;

public interface ITopicCrudRepository extends JpaRepository<TopicEntity, Long>{

}
