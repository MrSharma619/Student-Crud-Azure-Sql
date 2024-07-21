package com.example.Student_Crud_Azure_Sql.repo;

import com.example.Student_Crud_Azure_Sql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

}
