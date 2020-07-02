package com.guiacompass.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guiacompass.apirest.repository.CompanyRepository;

import com.guiacompass.apirest.models.Company;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class CompanyResource {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@GetMapping("/companies")
	public List<Company> listCompanies(){
		return companyRepository.findAll();
	}
	
	@GetMapping("/company/{id}")
	public Company listCompany(@PathVariable(value="id") long id_company){
		return companyRepository.findById(id_company);
	}
	
	@PostMapping("/company")
	public Company createCompany(@RequestBody Company company) {
		return companyRepository.save(company);
	}
	
	@DeleteMapping("/company")
	public void deleteCompany(@RequestBody Company company) {
		companyRepository.delete(company);
	}
	
	@PutMapping("/company")
	public Company updateCompany(@RequestBody Company company) {
		return companyRepository.save(company);
	}
}
