package com.new19.ForoHub.dto.user;

import jakarta.validation.constraints.Email;

public record UpdateUserDTO(Long userId, @Email String email, String name, String password) {

}
