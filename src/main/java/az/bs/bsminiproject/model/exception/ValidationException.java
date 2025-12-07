package az.bs.bsminiproject.model.exception;

import lombok.Getter;

@Getter
public class ValidationException extends RuntimeException {
    private String code;

    public ValidationException(String code) {
        super(code);
        this.code = code;
    }
}
