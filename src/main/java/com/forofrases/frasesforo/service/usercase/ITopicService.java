package com.forofrases.frasesforo.service.usercase;

import java.util.List;
import java.util.Optional;

import com.forofrases.frasesforo.model.dto.TopicRequest;
import com.forofrases.frasesforo.model.dto.TopicResponse;



public interface ITopicService {

List<TopicResponse> getAll();
Optional<TopicResponse> findById(Long id);
TopicRequest save(TopicRequest frasesRequest);
Optional<TopicRequest> update(TopicRequest usuarioDto, Long id);
boolean delete(Long id);


}
