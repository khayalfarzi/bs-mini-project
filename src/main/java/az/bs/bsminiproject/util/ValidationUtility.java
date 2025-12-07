package az.bs.bsminiproject.util;

import az.bs.bsminiproject.model.request.StudentRequestDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidationUtility {

    public static void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
    }

    public void validate(StudentRequestDto studentRequestDto) {
        if (studentRequestDto.getName() == null || studentRequestDto.getName().length() < 3) {
            throw new IllegalArgumentException("Name must be at least 3 characters long");
        }

        if (studentRequestDto.getSurname() == null || studentRequestDto.getSurname().length() < 5) {
            throw new IllegalArgumentException("Surname must be at least 5 characters long");
        }

        if (studentRequestDto.getEmail() == null || !studentRequestDto.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
        if (studentRequestDto.getGroup() == null || studentRequestDto.getGroup().length() < 4) {
            throw new IllegalArgumentException("Group must be at least 4 characters long");
        }
    }

}
