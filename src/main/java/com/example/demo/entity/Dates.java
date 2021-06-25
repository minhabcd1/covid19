package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dates {
	@JsonProperty(value = "dates")
	public ListDate ListDate;

	public ListDate getListDate() {
		return ListDate;
	}

	public void setListDate(ListDate listDate) {
		ListDate = listDate;
	}
}
