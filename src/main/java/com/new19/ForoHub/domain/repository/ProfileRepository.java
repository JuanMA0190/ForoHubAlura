package com.new19.ForoHub.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.new19.ForoHub.domain.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
}
