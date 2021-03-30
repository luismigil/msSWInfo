package com.info.sw.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.info.sw.ms.model.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer>{
	
	@Query(nativeQuery = true, value = "select * from (\r\n"
			+ "	SELECT  count(*) counts, fs.film_id, fs.starship_id FROM films_starships fs where fs.film_id in (:filmsIds) group by fs.starship_id "
			+ ") t "
			+ "join people_starships ps on ps.starship_id=t.starship_id "
			+ "join people p on p.id=ps.people_id "
			+ "where t.counts = (SELECT  count(*) counts FROM films_starships fs where fs.film_id in (:filmsIds) group by fs.starship_id order by counts desc limit 1)")
	List<People> getMostCommonPilotByFilms(@Param("filmsIds")List<Integer> filmsIds);
}
