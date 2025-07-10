package in.jpjena.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.jpjena.sbms.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
