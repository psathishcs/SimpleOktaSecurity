package org.hello.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.hello.boot.entity.Country;
import org.hello.boot.repository.CountryRepository;

@RestController
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;

	@RequestMapping(value="/country", method = RequestMethod.GET,  produces="application/json")
	@Secured("ROLE_ADMIN")
	public List<Country> getAll() {
		return countryRepository.getAll();
	}
	
	@RequestMapping(value="/country/{code}", method = RequestMethod.GET,  produces="application/json")
	public Country getByID(@PathVariable String code) {
		return countryRepository.getByID(code);
	}
	
	@RequestMapping(value="/country/name/{name}", method = RequestMethod.GET,  produces="application/json")
	public Country getByName(@PathVariable String name) {
		return countryRepository.getByName(name);
	}
	
	@RequestMapping(value="/country/continent/{continent}", method = RequestMethod.GET,  produces="application/json")
	public List<Country> getByContinent(@PathVariable String continent) {
		return countryRepository.getByContinent(continent);
	}
	
	@RequestMapping(value="/country/region/{region}", method = RequestMethod.GET,  produces="application/json")
	public List<Country> getByRegion(@PathVariable String region) {
		return countryRepository.getByRegion(region);
	}
	
	@RequestMapping(value="/country/gnp/less/{gnp}", method = RequestMethod.GET,  produces="application/json")
	public List<Country> getByCountryLessGNP(float gnp){
		return countryRepository.getByCountryLessGNP(gnp);
	}
	
	@RequestMapping(value="/country/gnp/greate/{gnp}", method = RequestMethod.GET,  produces="application/json")
	public List<Country> getByCountryGreateGNP(float gnp){
		return countryRepository.getByCountryGreateGNP(gnp);
	}
}
