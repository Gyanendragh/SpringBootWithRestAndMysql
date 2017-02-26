package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> { /*as long is primitive so we use Long*/

}
