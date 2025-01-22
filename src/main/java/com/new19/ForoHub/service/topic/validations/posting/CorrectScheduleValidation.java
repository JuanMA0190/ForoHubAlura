package com.new19.ForoHub.service.topic.validations.posting;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.new19.ForoHub.dto.topic.RegisterTopicDTO;
import com.new19.ForoHub.infrastructure.errors.exception.BusinessRulesValidationsException;
import com.new19.ForoHub.service.topic.validations.ValidatorPostingTopic;

@Component
public class CorrectScheduleValidation implements ValidatorPostingTopic{

    @Override
    public void validate(RegisterTopicDTO data) {
        int currentHour = LocalDateTime.now().getHour();

        if (currentHour < 7 || currentHour > 22) {
            throw new BusinessRulesValidationsException("No esta permitido publicar un topico en este horario");
        }
        
    }
    
}
