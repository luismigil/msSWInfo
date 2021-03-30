package com.info.sw.ms.dto;

import java.util.List;
import java.util.Set;

public class FilmsDTO {

	private Integer id;
	private String title;
	private Integer episodeId;
	private String openingCrawl;
	private String director;
	private String producer;
	private String releaseDate;
	private String species;
	private List<Integer> starshipsIds;
	private String vehicles;
	private List<Integer> charactersIds;
	private String planets;
	private String url;
	private String created;
	private String edited;
	
	public FilmsDTO(Integer id, String title, Integer episodeId, String openingCrawl, String director, String producer,
			String releaseDate, String species, List<Integer> starshipsIds, String vehicles, List<Integer> charactersIds,
			String planets, String url, String created, String edited) {
		super();
		this.id = id;
		this.title = title;
		this.episodeId = episodeId;
		this.openingCrawl = openingCrawl;
		this.director = director;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.species = species;
		this.starshipsIds = starshipsIds;
		this.vehicles = vehicles;
		this.charactersIds = charactersIds;
		this.planets = planets;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}
	public FilmsDTO() {}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getEpisodeId() {
		return episodeId;
	}
	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}
	public String getOpeningCrawl() {
		return openingCrawl;
	}
	public void setOpeningCrawl(String openingCrawl) {
		this.openingCrawl = openingCrawl;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public List<Integer> getStarshipsIds() {
		return starshipsIds;
	}
	public void setStarshipsIds(List<Integer> starshipsIds) {
		this.starshipsIds = starshipsIds;
	}
	public String getVehicles() {
		return vehicles;
	}
	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}
	public List<Integer> getCharactersIds() {
		return charactersIds;
	}
	public void setCharactersIds(List<Integer> charactersIds) {
		this.charactersIds = charactersIds;
	}
	public String getPlanets() {
		return planets;
	}
	public void setPlanets(String planets) {
		this.planets = planets;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getEdited() {
		return edited;
	}
	public void setEdited(String edited) {
		this.edited = edited;
	}
}
