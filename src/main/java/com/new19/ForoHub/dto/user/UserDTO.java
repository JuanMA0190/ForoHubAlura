package com.new19.ForoHub.dto.user;

import java.util.List;

import com.new19.ForoHub.domain.model.User;
import com.new19.ForoHub.dto.profile.ProfileDTO;

public record UserDTO(Long userId, String name, String email, List<ProfileDTO> profiles) {
 
    public UserDTO(User user){
        this(user.getUserId(), user.getName(), user.getEmail(), user.getProfiles().stream().map(ProfileDTO::new).toList());
    }
}
