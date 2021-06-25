package com.example.demo.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CountryName;
import com.example.demo.entity.History;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Information {

	@RequestMapping("/")
	public String Global(Model model, RestTemplate restTemplate) throws MalformedURLException, IOException {
		try {
			String response = restTemplate.getForObject("https://covid-api.mmediagroup.fr/v1/cases?country=Global",
					String.class);
			ObjectMapper mapper = new ObjectMapper();
			CountryName countryName = mapper.readValue(response, CountryName.class);

			model.addAttribute("country", countryName.getAll());
			model.addAttribute("mortalityRate",
					(float) countryName.getAll().getDeaths() * 100 / countryName.getAll().getConfirmed() + "%");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "mainPage";

	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String submitDate(Model model, RestTemplate restTemplate, @RequestParam("date") String date)
			throws MalformedURLException, IOException {
		try {

			String confirmed = restTemplate.getForObject(
					"https://covid-api.mmediagroup.fr/v1/history?country=Global&status=confirmed", String.class);
			String recovered = restTemplate.getForObject(
					"https://covid-api.mmediagroup.fr/v1/history?country=Global&status=recovered", String.class);
			String deaths = restTemplate.getForObject(
					"https://covid-api.mmediagroup.fr/v1/history?country=Global&status=deaths", String.class);

			ObjectMapper mapper = new ObjectMapper();
			History Confirm = mapper.readValue(confirmed, History.class);
			History Recovered = mapper.readValue(recovered, History.class);
			History Deaths = mapper.readValue(deaths, History.class);
			if ("24".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay24());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay24());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay24());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay24() * 100
						/ Confirm.getDates().getListDate().getDay24() + "%");
			} else if ("23".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay23());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay23());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay23());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay23() * 100
						/ Confirm.getDates().getListDate().getDay23() + "%");
			} else if ("22".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay22());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay22());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay22());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay22() * 100
						/ Confirm.getDates().getListDate().getDay22() + "%");
			} else if ("21".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay21());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay21());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay21());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay21() * 100
						/ Confirm.getDates().getListDate().getDay21() + "%");
			} else if ("20".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay20());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay20());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay20());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay20() * 100
						/ Confirm.getDates().getListDate().getDay20() + "%");
			} else if ("19".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay19());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay19());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay19());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay19() * 100
						/ Confirm.getDates().getListDate().getDay19() + "%");
			} else if ("18".equals(date)) {
				model.addAttribute("confirm", Confirm.getDates().getListDate().getDay18());
				model.addAttribute("recovered", Recovered.getDates().getListDate().getDay18());
				model.addAttribute("deaths", Deaths.getDates().getListDate().getDay18());
				model.addAttribute("mortalityRateDate", (float) Deaths.getDates().getListDate().getDay18() * 100
						/ Confirm.getDates().getListDate().getDay18() + "%");
			}
			model.addAttribute("Date", date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "mainPage";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(Model model, RestTemplate restTemplate, @RequestParam("name") String name)
			throws MalformedURLException, IOException {
		try {

			String response = restTemplate.getForObject("https://covid-api.mmediagroup.fr/v1/cases?country=" + name,
					String.class);
			ObjectMapper mapper = new ObjectMapper();
			CountryName countryName = mapper.readValue(response, CountryName.class);

			model.addAttribute("name", name);
			model.addAttribute("country", countryName.getAll());
			model.addAttribute("mortalityRate",
					(float) countryName.getAll().getDeaths() * 100 / countryName.getAll().getConfirmed() + "%");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "mainPage";
	}

	@RequestMapping("/Vietnam")
	public String VietnamRecord(Model model, RestTemplate restTemplate) throws MalformedURLException, IOException {
		try {

			String response = restTemplate.getForObject("https://covid-api.mmediagroup.fr/v1/cases?country=Vietnam",
					String.class);
			ObjectMapper mapper = new ObjectMapper();
			CountryName countryName = mapper.readValue(response, CountryName.class);

			model.addAttribute("country", countryName.getAll());
			model.addAttribute("mortalityRate",
					(float) countryName.getAll().getDeaths() * 100 / countryName.getAll().getConfirmed() + "%");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "vietnam";
	}

	@RequestMapping(value = "/Vaccine")
	public String VietnamVaccine(Model model, RestTemplate restTemplate) throws MalformedURLException, IOException {
		try {

			String response = restTemplate.getForObject("https://covid-api.mmediagroup.fr/v1/vaccines?country=Vietnam",
					String.class);
			ObjectMapper mapper = new ObjectMapper();
			CountryName countryName = mapper.readValue(response, CountryName.class);

			model.addAttribute("vaccine", countryName.getAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "VietnamVaccine";
	}

}
