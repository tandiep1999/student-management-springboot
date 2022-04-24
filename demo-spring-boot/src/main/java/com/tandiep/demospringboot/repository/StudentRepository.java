package com.tandiep.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tandiep.demospringboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
