package com.jonathas.training.repository;

import com.jonathas.training.hello.Greeting;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
