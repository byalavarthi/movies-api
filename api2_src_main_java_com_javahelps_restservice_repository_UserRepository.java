package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.User;

@RepositoryRestResource(path = "/students")

public interface UserRepository extends JpaRepository<User, String> {

}