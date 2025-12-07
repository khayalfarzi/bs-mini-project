package az.bs.bsminiproject.service.impl;

import az.bs.bsminiproject.helper.StudentHelper;
import az.bs.bsminiproject.model.request.StudentRequestDto;
import az.bs.bsminiproject.mapper.StudentMapper;
import az.bs.bsminiproject.dao.repository.StudentRepository;
import az.bs.bsminiproject.model.response.StudentLightResponseDto;
import az.bs.bsminiproject.service.StudentService;
import az.bs.bsminiproject.util.ValidationUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
@Profile(value = "main")
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private static final Logger log = Logger.getLogger(StudentServiceImpl.class.getName());

    private final StudentRepository studentRepository;
    private final StudentHelper studentHelper;

    @Override
    public void addStudent(StudentRequestDto studentRequestDto) {
        log.info("ActionLog.addStudent start");

        ValidationUtility.validate(studentRequestDto);

        studentHelper.checkEmail(studentRequestDto.getEmail());

        var student = StudentMapper.INSTANCE.toEntity(studentRequestDto);

        studentRepository.save(student);

        log.info("ActionLog.addStudent end");
    }

    @Override
    public List<StudentLightResponseDto> getLightStudents() {
        log.info("ActionLog.getLightStudents start");

        var students = studentRepository.findAllLight();

        var response = students.stream().map(StudentMapper.INSTANCE::toDto).toList();
        log.info("ActionLog.getLightStudents end");
        return response;
    }
}
