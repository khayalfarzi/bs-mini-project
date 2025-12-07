package az.bs.bsminiproject.helper;

import az.bs.bsminiproject.dao.repository.StudentRepository;
import az.bs.bsminiproject.model.exception.ValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentHelper {

    private final StudentRepository studentRepository;

    public void checkEmail(String email) {
        var studentEmail = studentRepository.findByEmail(email);

        if (studentEmail.isPresent()) {
            throw new ValidationException("EMAIL_ALREADY_EXISTS");
        }
    }
}
