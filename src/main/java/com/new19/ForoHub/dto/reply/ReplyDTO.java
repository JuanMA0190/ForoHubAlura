package com.new19.ForoHub.dto.reply;

import java.time.LocalDateTime;

import com.new19.ForoHub.domain.model.Reply;

import jakarta.validation.constraints.NotNull;

public record ReplyDTO(@NotNull Long replyId, String message, Long topicId,
                         Long authorId, LocalDateTime createdAt, String solution ) {
    
    public ReplyDTO(Reply reply){
        this(reply.getReplyId(), reply.getMessage(), reply.getTopic().getTopicId(),
            reply.getUser().getUserId(), reply.getCreatedAt(), reply.getSolution());
    }
}
