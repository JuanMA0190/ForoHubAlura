package com.new19.ForoHub.dto.topic;

import java.time.LocalDateTime;
import java.util.List;

import com.new19.ForoHub.domain.model.Topic;
import com.new19.ForoHub.domain.model.TopicStatus;
import com.new19.ForoHub.dto.reply.ReplyDTO;


public record TopicDTO(
    Long topicId,
    String title,
    String message,
    TopicStatus status,
    String author,
    String course,
    LocalDateTime createdAt,
    List<ReplyDTO> replies
    ) {

    public TopicDTO(Topic topic){
        this(topic.getTopicId(), 
            topic.getTitle(), 
            topic.getMessage(), 
            topic.getStatus(),
            topic.getUser().getName(), 
            topic.getCourse().getName(), 
            topic.getCreatedAt(),
            topic.getReplies().stream().map(ReplyDTO::new).toList());
    }
    
}
