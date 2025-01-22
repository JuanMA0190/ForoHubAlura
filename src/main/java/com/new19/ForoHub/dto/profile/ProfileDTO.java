package com.new19.ForoHub.dto.profile;

import com.new19.ForoHub.domain.model.Profile;
import com.new19.ForoHub.domain.model.ProfileType;

import jakarta.validation.constraints.NotNull;

public record ProfileDTO(@NotNull Long profileId,  @NotNull ProfileType profileType ) {
    
    public ProfileDTO(Profile profile){
        this(profile.getProfileId(), ProfileType.fromString(profile.getName()));
    }
}
