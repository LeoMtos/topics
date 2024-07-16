package com.forofrases.frasesforo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forofrases.frasesforo.model.dto.TopicRequest;
import com.forofrases.frasesforo.model.dto.TopicResponse;
import com.forofrases.frasesforo.service.usercase.ITopicService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class TopicController {

    private final ITopicService iTopicService;

@GetMapping("/topic")
public ResponseEntity<List<TopicResponse>> getAll(){
 return ResponseEntity.ok(iTopicService.getAll());
}

@GetMapping("topic/{id}")
public ResponseEntity<TopicResponse> findById(@PathVariable Long id) {
    return ResponseEntity.of(iTopicService.findById(id));
}

@PostMapping("/topic")
public ResponseEntity<TopicRequest> save(@RequestBody TopicRequest topicResponse ){
    return ResponseEntity.ok(iTopicService.save(topicResponse));
}

@DeleteMapping("topic/{id}")
public ResponseEntity<Void> deleteFrase(@PathVariable Long id) {
    boolean isDeleted = iTopicService.delete(id);
    
    if (isDeleted) {
        return ResponseEntity.noContent().build();
    } else {
        return ResponseEntity.notFound().build();
    }
}

}
