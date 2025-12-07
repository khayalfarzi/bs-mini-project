package az.bs.bsminiproject.controller;

import az.bs.bsminiproject.model.request.StudentRequestDto;
import az.bs.bsminiproject.model.response.StudentLightResponseDto;
import az.bs.bsminiproject.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody @Valid StudentRequestDto studentRequestDto) {
        studentService.addStudent(studentRequestDto);
    }

    @GetMapping("/light")
    public List<StudentLightResponseDto> getLightStudents() {
        return studentService.getLightStudents();
    }
}
