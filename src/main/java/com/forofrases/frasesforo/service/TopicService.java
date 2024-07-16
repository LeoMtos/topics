package com.forofrases.frasesforo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.forofrases.frasesforo.model.dto.TopicRequest;
import com.forofrases.frasesforo.model.dto.TopicResponse;
import com.forofrases.frasesforo.model.repository.ITopicRepository;
import com.forofrases.frasesforo.service.usercase.ITopicService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TopicService implements ITopicService{
    
    private final ITopicRepository iTopicRepository;

    @Override
    public List<TopicResponse> getAll() {
       return iTopicRepository.getAll();
    }

    @Override
    public Optional<TopicResponse> findById(Long id) {
      return iTopicRepository.findById(id);
    }

    @Override
    public TopicRequest save(TopicRequest topicRequest) {
        
        return iTopicRepository.save(topicRequest);
    }

    @Override
    public Optional<TopicRequest> update(TopicRequest usuarioDto, Long id) {
       return null;
    }

    @Override
    public boolean delete(Long id) {

        Optional<TopicResponse> topicResponseOptional = iTopicRepository.findById(id);

       if(topicResponseOptional.isPresent()){
        iTopicRepository.delete(id);
        return true;
       }

       return false;
    }

 

    
}
