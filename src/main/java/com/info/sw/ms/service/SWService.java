package com.info.sw.ms.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.sw.ms.dto.FilmsDTO;
import com.info.sw.ms.dto.PeopleDTO;
import com.info.sw.ms.mapper.FilmsMapper;
import com.info.sw.ms.mapper.PeopleMapper;
import com.info.sw.ms.model.Films;
import com.info.sw.ms.model.People;
import com.info.sw.ms.repository.FilmsRepository;
import com.info.sw.ms.repository.PeopleRepository;

@Service
public class SWService {

	@Autowired
	PeopleRepository peopleRepository;
	
	@Autowired
	FilmsRepository filmsRepository;
	
	@Autowired
	PeopleMapper peopleMapper;
	
	@Autowired
	FilmsMapper filmsMapper;
	
	public List<PeopleDTO> getAllPeople(){
		return peopleRepository.findAll()
				.stream().map(peopleMapper::toDTO)
				.collect(Collectors.toCollection(LinkedList::new));
	}
	
	public List<FilmsDTO> getAllFilms(){
		return filmsRepository.findAll()
				.stream().map(filmsMapper::toDTO)
				.collect(Collectors.toCollection(LinkedList::new));
	}
	
	public List<PeopleDTO>getMaxStarshipsPilotsByFilms(List<Integer> filmsIds) {
//		List<People> people = new ArrayList<People>();
//		people = peopleRepository.getMostCommonPilotByFilms(filmsIds);
//		List<Films> films = filmsRepository.findByIdIn(filmsIds);
		
		
		
		
		return peopleRepository.getMostCommonPilotByFilms(filmsIds)
				.stream().map(peopleMapper::toDTO)
				.collect(Collectors.toCollection(LinkedList::new));
	}
}
