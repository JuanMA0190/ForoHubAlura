package com.new19.ForoHub.service.topic.validations.posting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.new19.ForoHub.domain.repository.TopicRepository;
import com.new19.ForoHub.dto.topic.RegisterTopicDTO;
import com.new19.ForoHub.infrastructure.errors.exception.BusinessRulesValidationsException;
import com.new19.ForoHub.service.topic.validations.ValidatorPostingTopic;


@Component
public class DuplicateTopicValidation implements ValidatorPostingTopic {

    @Autowired
    private TopicRepository topicRepository;
    
    @Override
    public void validate(RegisterTopicDTO data) {
        var duplicateTopic = topicRepository.existsByTitleAndMessage(data.title(),  data.message());

        if (duplicateTopic) {
            throw new BusinessRulesValidationsException("Existe un topico con exactamente el mismo titulo y mensaje, por lo que no puede ser duplicado");
        }
    }
    
}
