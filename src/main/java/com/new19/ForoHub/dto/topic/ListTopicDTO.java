package com.new19.ForoHub.dto.topic;

import java.time.LocalDateTime;

import com.new19.ForoHub.domain.model.Topic;
import com.new19.ForoHub.domain.model.TopicStatus;

public record ListTopicDTO(
    Long topicId,
    String title,
    LocalDateTime createdAt,
    TopicStatus status,
    String authorName,
    String courseName
    ) {

    public ListTopicDTO(Topic topic){
        this(topic.getTopicId(), topic.getTitle(), topic.getCreatedAt(), topic.getStatus(), 
        topic.getUser().getName(), topic.getCourse().getName());
    }    
    
}
