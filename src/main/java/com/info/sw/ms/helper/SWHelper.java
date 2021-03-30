package com.info.sw.ms.helper;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.info.sw.ms.model.Films;
import com.info.sw.ms.model.People;

public class SWHelper {

	public static List<People> getMaxStarshipsPilotsByFilms(List<Integer> filmsIds){
		List<People> people = new ArrayList<People>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("People");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Films> query = cb.createQuery(Films.class);
        Root<Films> root = query.from(Films.class);
        
        TypedQuery<People> tq = em.createQuery("SELECT f FROM Films f ", People.class);
        
        
		return people;
	}
}
