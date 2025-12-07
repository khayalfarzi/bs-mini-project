package az.bs.bsminiproject.service;

import az.bs.bsminiproject.model.request.StudentRequestDto;
import az.bs.bsminiproject.model.response.StudentLightResponseDto;

import java.util.List;

public interface StudentService {
    void addStudent(StudentRequestDto studentRequestDto);

    List<StudentLightResponseDto> getLightStudents();
}
