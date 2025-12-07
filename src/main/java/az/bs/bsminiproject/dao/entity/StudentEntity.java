package az.bs.bsminiproject.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "student_group")
    private String group;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "students_courses",
            joinColumns = @JoinColumn(name = "stundet_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id",
                    referencedColumnName = "id"))
    private List<CourseEntity> courses;
}
