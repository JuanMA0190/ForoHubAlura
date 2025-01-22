package com.new19.ForoHub.dto.course;

import com.new19.ForoHub.domain.model.Category;
import com.new19.ForoHub.domain.model.Course;

import jakarta.validation.constraints.NotBlank;

public record CourseDTO(@NotBlank Long courseId, String name, Category category) {
    
    public CourseDTO(Course course){
        this(course.getCourseId(), course.getName(), course.getCategory());
    }
}
