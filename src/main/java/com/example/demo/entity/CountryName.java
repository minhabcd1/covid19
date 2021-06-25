package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryName {

	@JsonProperty("All")
	public All All;

	public All getAll() {
		return All;
	}

	public void setAll(All all) {
		All = all;
	}

}
