package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListDate {
	@JsonProperty(value = "2021-06-24")
	public Long day24;

	@JsonProperty(value = "2021-06-23")
	public Long day23;

	@JsonProperty(value = "2021-06-22")
	public Long day22;

	@JsonProperty(value = "2021-06-21")
	public Long day21;

	@JsonProperty(value = "2021-06-20")
	public Long day20;

	@JsonProperty(value = "2021-06-19")
	public Long day19;

	@JsonProperty(value = "2021-06-18")
	public Long day18;

	public Long getDay24() {
		return day24;
	}

	public Long getDay23() {
		return day23;
	}

	public void setDay23(Long day23) {
		this.day23 = day23;
	}

	public Long getDay22() {
		return day22;
	}

	public void setDay22(Long day22) {
		this.day22 = day22;
	}

	public Long getDay21() {
		return day21;
	}

	public void setDay21(Long day21) {
		this.day21 = day21;
	}

	public Long getDay20() {
		return day20;
	}

	public void setDay20(Long day20) {
		this.day20 = day20;
	}

	public Long getDay19() {
		return day19;
	}

	public void setDay19(Long day19) {
		this.day19 = day19;
	}

	public Long getDay18() {
		return day18;
	}

	public void setDay18(Long day18) {
		this.day18 = day18;
	}

	public void setDay24(Long day24) {
		this.day24 = day24;
	}

}
