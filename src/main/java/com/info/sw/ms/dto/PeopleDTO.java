package com.info.sw.ms.dto;

import java.util.List;

import com.info.sw.ms.bean.FilmBean;

public class PeopleDTO {
	
	private Integer id;
	private String name;
	private String birthYear;
	private String eyeColor;
	private String gender;
	private String hairColor;
	private String height;
	private String mass;
	private String skinColor;
	private String homeworld;
	private Integer filmsCount;
	private List<FilmBean> films;
	private String species;
	private List<Integer> starshipsIds;//TO-DO implement same logic as films and filmsCount fields
	private String vehicles;
	private String url;
	private String created;
	private String edited;
	
	public PeopleDTO(Integer id, String name, String birthYear, String eyeColor, String gender, String hairColor,
			String height, String mass, String skinColor, String homeworld, List<FilmBean> films, String species,
			List<Integer> starshipsIds, String vehicles, String url, String created, String edited) {
		super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.eyeColor = eyeColor;
		this.gender = gender;
		this.hairColor = hairColor;
		this.height = height;
		this.mass = mass;
		this.skinColor = skinColor;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.starshipsIds = starshipsIds;
		this.vehicles = vehicles;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}
	public PeopleDTO() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getHomeworld() {
		return homeworld;
	}
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
	
	public Integer getFilmsCount() {
		return filmsCount;
	}
	public void setFilmsCount(Integer filmsCount) {
		this.filmsCount = filmsCount;
	}
	public List<FilmBean> getFilms() {
		return films;
	}
	public void setFilms(List<FilmBean> films) {
		this.films = films;
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
