package com.guiacompass.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiacompass.apirest.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	Company findById(long id_company);
	
}
