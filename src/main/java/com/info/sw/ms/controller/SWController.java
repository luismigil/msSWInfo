package com.info.sw.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.info.sw.ms.dto.FilmsDTO;
import com.info.sw.ms.dto.PeopleDTO;
import com.info.sw.ms.service.SWService;

@Controller
@RequestMapping("/")
public class SWController {
	
	String message = "";
	@Autowired
	SWService swService;

	@GetMapping("people")
	public ResponseEntity<List<PeopleDTO>> getAllPeople(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(swService.getAllPeople());
		}catch(Exception e) {
			message = "Getting info error: " + e.getMessage();
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(null);
		}
	}
	
	@GetMapping("films")
	public ResponseEntity<List<FilmsDTO>> getAllFilms(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(swService.getAllFilms());
		}catch(Exception e) {
			message = "Getting info error: " + e.getMessage();
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(null);
		}
	}
	
	@GetMapping("films/starships/pilots")
	public ResponseEntity<List<PeopleDTO>> getMaxPilotsByFilms(@RequestParam List<Integer> filmsIds){
		return ResponseEntity.status(HttpStatus.OK).body(swService.getMaxStarshipsPilotsByFilms(filmsIds));
	}
}
