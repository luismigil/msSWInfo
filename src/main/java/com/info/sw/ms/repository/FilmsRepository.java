package com.info.sw.ms.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.sw.ms.model.Films;

@Repository
public interface FilmsRepository extends JpaRepository<Films, Integer>{
	
	List<Films> findByIdIn(Collection<Integer> ids);
}
