package az.bs.bsminiproject.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class CourseEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "courses")
    List<StudentEntity> students;
}
