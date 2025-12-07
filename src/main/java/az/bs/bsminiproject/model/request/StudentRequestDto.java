package az.bs.bsminiproject.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {

    @NotEmpty
    @Length(min = 3, max = 20)
    private String name;

    @NotEmpty
    @Length(min = 5, max = 20)
    private String surname;

    @Email
    private String email;

    private String group;
}
