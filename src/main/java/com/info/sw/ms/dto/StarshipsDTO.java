package com.info.sw.ms.dto;

import java.util.List;

public class StarshipsDTO {

	private Integer id;
	private String name;
	private String model;
	private String starshipClass;
	private String manufacturer;
	private String costInCredits;
	private String length;
	private String crew;
	private String passengers;
	private String maxAtmospheringSpeed;
	private String hyperdriveRating;
	private String mglt;
	private String cargoCapacity;
	private String consumables;
	private List<Integer> filmsIds;
	private List<Integer> pilotsIds;
	private String url;
	private String created;
	private String edited;
	
	public StarshipsDTO(Integer id, String name, String model, String starshipClass, String manufacturer,
			String costInCredits, String length, String crew, String passengers, String maxAtmospheringSpeed,
			String hyperdriveRating, String mglt, String cargoCapacity, String consumables, List<Integer> filmsIds,
			List<Integer> pilotsIds, String url, String created, String edited) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.starshipClass = starshipClass;
		this.manufacturer = manufacturer;
		this.costInCredits = costInCredits;
		this.length = length;
		this.crew = crew;
		this.passengers = passengers;
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
		this.hyperdriveRating = hyperdriveRating;
		this.mglt = mglt;
		this.cargoCapacity = cargoCapacity;
		this.consumables = consumables;
		this.filmsIds = filmsIds;
		this.pilotsIds = pilotsIds;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}
	public StarshipsDTO() {}
	
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStarshipClass() {
		return starshipClass;
	}
	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCostInCredits() {
		return costInCredits;
	}
	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}
	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}
	public String getHyperdriveRating() {
		return hyperdriveRating;
	}
	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}
	public String getMglt() {
		return mglt;
	}
	public void setMglt(String mglt) {
		this.mglt = mglt;
	}
	public String getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}
	public List<Integer> getFilmsIds() {
		return filmsIds;
	}
	public void setFilmsIds(List<Integer> filmsIds) {
		this.filmsIds = filmsIds;
	}
	public List<Integer> getPilotsIds() {
		return pilotsIds;
	}
	public void setPilotsIds(List<Integer> pilotsIds) {
		this.pilotsIds = pilotsIds;
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
