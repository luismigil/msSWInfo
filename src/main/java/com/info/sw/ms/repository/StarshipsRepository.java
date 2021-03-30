package com.info.sw.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.sw.ms.model.Starships;

public interface StarshipsRepository extends JpaRepository<Starships, Integer>{}
