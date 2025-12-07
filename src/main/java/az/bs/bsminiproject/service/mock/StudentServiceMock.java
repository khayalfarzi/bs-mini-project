package az.bs.bsminiproject.service.mock;

import az.bs.bsminiproject.model.request.StudentRequestDto;
import az.bs.bsminiproject.model.response.StudentLightResponseDto;
import az.bs.bsminiproject.service.StudentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "local")
public class StudentServiceMock implements StudentService {

    @Override
    public void addStudent(StudentRequestDto studentRequestDto) {
        System.out.println("addStudent - MOCK ");
        // created
    }

    @Override
    public List<StudentLightResponseDto> getLightStudents() {
        return List.of();
    }
}
