package com.forofrases.frasesforo.persistence.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.forofrases.frasesforo.model.dto.TopicRequest;
import com.forofrases.frasesforo.model.dto.TopicResponse;
import com.forofrases.frasesforo.model.repository.ITopicRepository;
import com.forofrases.frasesforo.persistence.entity.TopicEntity;
import com.forofrases.frasesforo.persistence.mapper.ITopicMapper;

import com.forofrases.frasesforo.persistence.repository.crud.ITopicCrudRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Repository
public class TopicRepository implements ITopicRepository{

    private final ITopicCrudRepository iTopicCrudRepository;
    private final ITopicMapper iTopicMapper;


    @Override
    public List<TopicResponse> getAll() {
        return iTopicMapper.toFrasesResponses(iTopicCrudRepository.findAll());
    }

    @Override
    public Optional<TopicResponse> findById(Long id) {
        return iTopicCrudRepository.findById(id).map(topicEntity -> iTopicMapper.toFrasesResponse(topicEntity));
    }

    @Override
    public TopicRequest save(TopicRequest frasesRequest) {
        TopicEntity topicEntity =iTopicMapper.toFrasesEntity(frasesRequest);
        topicEntity.setFechaCreacion(LocalDate.now());
      return iTopicMapper.toFrasesRequest(iTopicCrudRepository.save(topicEntity));
    }

    @Override
    public void delete(Long id) {
        iTopicCrudRepository.deleteById(id);
    }

}
