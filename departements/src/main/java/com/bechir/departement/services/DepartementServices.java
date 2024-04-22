package com.bechir.departement.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bechir.departement.Departement;

public interface DepartementServices {
	
	List<Departement> getAllDepartement();
	Departement getDepartement(Long id);
	void deleteDepartementById(Long id);
	void deleteDepartement(Departement p);
	Departement updateDepartement(Departement p);
	Departement saveDepartement(Departement p);
	Page<Departement> getAllDepartementParPage(int page, int size);

}
