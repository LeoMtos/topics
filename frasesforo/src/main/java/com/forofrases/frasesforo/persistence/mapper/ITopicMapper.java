package com.forofrases.frasesforo.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.forofrases.frasesforo.model.dto.TopicRequest;
import com.forofrases.frasesforo.model.dto.TopicResponse;
import com.forofrases.frasesforo.persistence.entity.TopicEntity;

@Mapper(componentModel = "spring")
public interface ITopicMapper {

    TopicRequest toFrasesRequest(TopicEntity frasesEntity);

    TopicResponse toFrasesResponse(TopicEntity frasesEntity);

    @Mapping(target = "fechaCreacion", ignore = true)
    TopicEntity toFrasesEntity(TopicRequest frasesRequest);

    List<TopicRequest> toFrasesRequests(List<TopicEntity> fraseEntityList);

    List<TopicResponse> toFrasesResponses(List<TopicEntity> frasesEntities);

}
