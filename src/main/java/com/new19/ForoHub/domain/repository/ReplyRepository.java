package com.new19.ForoHub.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.new19.ForoHub.domain.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{
    
}
