package az.bs.bsminiproject.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentLightResponseDto {

    private Long id;
    private String name;
    private String email;
}
