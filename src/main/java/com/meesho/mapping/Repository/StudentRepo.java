package com.meesho.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meesho.mapping.StudentInformation;

public interface StudentRepo extends JpaRepository<StudentInformation, Integer>{

}
