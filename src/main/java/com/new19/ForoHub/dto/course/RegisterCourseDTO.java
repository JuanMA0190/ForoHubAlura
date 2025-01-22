package com.new19.ForoHub.dto.course;

import com.new19.ForoHub.domain.model.Category;
import com.new19.ForoHub.domain.model.Course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterCourseDTO(@NotBlank String name, @NotNull Category category) {

    public RegisterCourseDTO(Course course){
        this(course.getName(), course.getCategory());
    }
}
