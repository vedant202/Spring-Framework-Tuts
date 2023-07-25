package com.SpringBootTuts.SpringBootJpaTuts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.SpringBootTuts.SpringBootJpaTuts.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path = "aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
