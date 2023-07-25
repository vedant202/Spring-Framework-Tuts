package com.SpringBootTuts.SpringBootJpaTuts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.SpringBootTuts.SpringBootJpaTuts.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>{
	List<Alien> findByLang(String lang);
	
	List<Alien> findByAname(String aName);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where lang=?1 order by aname")
	List<Alien> findByLangSorted(String lang);
}
