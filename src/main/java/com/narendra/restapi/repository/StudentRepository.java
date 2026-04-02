package com.narendra.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narendra.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
