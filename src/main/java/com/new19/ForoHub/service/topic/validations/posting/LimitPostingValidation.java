package com.new19.ForoHub.service.topic.validations.posting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.new19.ForoHub.domain.repository.TopicRepository;
import com.new19.ForoHub.dto.topic.RegisterTopicDTO;
import com.new19.ForoHub.infrastructure.errors.exception.BusinessRulesValidationsException;
import com.new19.ForoHub.service.topic.validations.ValidatorPostingTopic;

@Component
public class LimitPostingValidation implements ValidatorPostingTopic{

    @Autowired
    private TopicRepository topicRepository;
    
    @Override
    public void validate(RegisterTopicDTO data) {
        var countTopicPostedToday = topicRepository.countTopicsCreatedByUserToday(data.authorId());
        
        if (countTopicPostedToday >= 3) {
            throw new BusinessRulesValidationsException("Haz alcanzado el limite de 3 post diarios");
        }
    }
    
}
