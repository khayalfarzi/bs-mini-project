package az.bs.bsminiproject.dao.repository;

import az.bs.bsminiproject.dao.entity.StudentEntity;
import az.bs.bsminiproject.dao.projection.StudentLightProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    Optional<StudentEntity> findByEmail(String email);

    @Query("SELECT s.id as id, s.name as studentName, s.email as email FROM StudentEntity s")
    List<StudentLightProjection> findAllLight();
}
