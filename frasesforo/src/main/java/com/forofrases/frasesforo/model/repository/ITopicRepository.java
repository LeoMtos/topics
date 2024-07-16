package com.forofrases.frasesforo.model.repository;

import java.util.List;
import java.util.Optional;

import com.forofrases.frasesforo.model.dto.TopicRequest;
import com.forofrases.frasesforo.model.dto.TopicResponse;

public interface ITopicRepository {
    
    List<TopicResponse> getAll();
    Optional<TopicResponse> findById(Long id);
    TopicRequest save(TopicRequest frasesRequest);
    void delete(Long id);

}
