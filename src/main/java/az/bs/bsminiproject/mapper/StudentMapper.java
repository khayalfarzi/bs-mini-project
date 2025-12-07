package az.bs.bsminiproject.mapper;

import az.bs.bsminiproject.dao.projection.StudentLightProjection;
import az.bs.bsminiproject.model.request.StudentRequestDto;
import az.bs.bsminiproject.dao.entity.StudentEntity;
import az.bs.bsminiproject.model.response.StudentLightResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "id", ignore = true)
    StudentEntity toEntity(StudentRequestDto studentRequestDto);

    @Mapping(target = "name", source = "studentName")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "id", source = "id")
    StudentLightResponseDto toDto(StudentLightProjection projection);
}
