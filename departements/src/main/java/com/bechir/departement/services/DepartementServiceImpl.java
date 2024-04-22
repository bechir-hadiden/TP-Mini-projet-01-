package com.bechir.departement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bechir.departement.Departement;
import com.bechir.departement.repos.DepartementRepository;
@Service
public class DepartementServiceImpl implements DepartementServices {

	@Autowired
	DepartementRepository  departementRepository ; 
	 @Override
	    public List<Departement> getAllDepartement() {
	       return departementRepository.findAll();
	    }

	    @Override
	    public Departement getDepartement(Long id) {
	      return  departementRepository.findById(id).get();
	    }

	    @Override
	    public void deleteDepartementById(Long id) {

departementRepository.deleteById(id);
}

	    @Override
	    public void deleteDepartement(Departement p) {
	    	departementRepository.delete(p);
	    }

	    @Override
	    public Departement updateDepartement(Departement p) {
	        // Implémentez la logique pour mettre à jour un département
	        return departementRepository.save(p);
	    }

	    @Override
	    public Departement saveDepartement(Departement p) {

	    	return departementRepository.save(p);
	    }

	    @Override
	    public Page<Departement> getAllDepartementParPage(int page, int size) {
			return departementRepository.findAll(PageRequest.of(page, size));
	    }

}
