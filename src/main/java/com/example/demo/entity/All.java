package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class All {

	@JsonProperty("confirmed")
	public Long confirmed;
	@JsonProperty("recovered")
	private Long recovered;
	@JsonProperty("deaths")
	private Long deaths;
	@JsonProperty("country")
	private String country;
	@JsonProperty("population")
	private Long population;
	@JsonProperty("sq_km_area")
	private Long sq_km_area;
	@JsonProperty("life_expectancy")
	private String life_expectancy;
	@JsonProperty("elevation_in_meters")
	private Long elevation_in_meters;
	@JsonProperty("continent")
	private String continent;
	@JsonProperty("abbreviation")
	private String abbreviation;
	@JsonProperty("location")
	private String location;
	@JsonProperty("iso")
	private Long iso;
	@JsonProperty("capital_city")
	private String capital_city;
	@JsonProperty("lat")
	private String lat;
	@JsonProperty("long")
	private String lonng;
	@JsonProperty("updated")
	private String updated;
	@JsonProperty("administered")
	private Long administered;
	@JsonProperty("people_vaccinated")
	private Long people_vaccinated;
	@JsonProperty("people_partially_vaccinated")
	private Long people_partially_vaccinated;

	public Long getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Long confirmed) {
		this.confirmed = confirmed;
	}

	public Long getRecovered() {
		return recovered;
	}

	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}

	public Long getDeaths() {
		return deaths;
	}

	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Long getSq_km_area() {
		return sq_km_area;
	}

	public void setSq_km_area(Long sq_km_area) {
		this.sq_km_area = sq_km_area;
	}

	public String getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(String life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public Long getElevation_in_meters() {
		return elevation_in_meters;
	}

	public void setElevation_in_meters(Long elevation_in_meters) {
		this.elevation_in_meters = elevation_in_meters;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getIso() {
		return iso;
	}

	public void setIso(Long iso) {
		this.iso = iso;
	}

	public String getCapital_city() {
		return capital_city;
	}

	public void setCapital_city(String capital_city) {
		this.capital_city = capital_city;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLonng() {
		return lonng;
	}

	public void setLonng(String lonng) {
		this.lonng = lonng;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getAdministered() {
		return administered;
	}

	public void setAdministered(Long administered) {
		this.administered = administered;
	}

	public Long getPeople_vaccinated() {
		return people_vaccinated;
	}

	public void setPeople_vaccinated(Long people_vaccinated) {
		this.people_vaccinated = people_vaccinated;
	}

	public Long getPeople_partially_vaccinated() {
		return people_partially_vaccinated;
	}

	public void setPeople_partially_vaccinated(Long people_partially_vaccinated) {
		this.people_partially_vaccinated = people_partially_vaccinated;
	}

}
