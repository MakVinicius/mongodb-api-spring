package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);

    List<Student> findByNameAndEmail(String name, String email);

    List<Student> findByNameOrEmail(String name, String email);

    List<Student> findBySubjectsSubjectName(String subName);

    List<Student> findByEmailIsLike (String email);

    List<Student> findByNameStartsWith (String name);

    List<Student> findByDepartmentDepartmentName(String deptName);
}
