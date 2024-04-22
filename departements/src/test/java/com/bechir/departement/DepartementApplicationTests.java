package com.bechir.departement;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.bechir.departement.repos.DepartementRepository;



@SpringBootTest
class DepartementApplicationTests {
	  @Autowired 
	    private DepartementRepository departementRepository;

	    @Test
	    public void testCreateDepartement() {
			Departement depa = new Departement("departement info ", 220, new Date());
	        departementRepository.save(depa);
	    }

	    @Test
	    public void testFindDepartement() {
	        Departement p = departementRepository.findById(1L).get();
	        System.out.println(p);
	    }

	    @Test
	    public void testUpdateDepartement() {
	        Departement depar = departementRepository.findById(1L).get();
	        depar.setNombre_employee(10);
	        departementRepository.save(depar);
	    }

	    @Test
 public void testDeleteProduit() {
	        departementRepository.deleteById(1L);
	    }

	    @Test
	    public void testListerTous() {
	        List<Departement> depar = departementRepository.findAll();
	        for (Departement d : depar) {
	            System.out.println(d);
	        }
	    }	
	    @Test
	    public void testFindByDeparContains()
	    {
	    Page<Departement> depar = departementRepository.getAllDepartementParPage(0,2);
	    System.out.println(depar.getSize());
	    System.out.println(depar.getTotalElements());
	    System.out.println(depar.getTotalPages());
	    depar.getContent().forEach(p -> {System.out.println(p.toString());
	     });
	    /*ou bien
	    for (Produit p : prods)
	    {
	    System.out.println(p);
	    } */
	    }

	@Test
	void contextLoads() {
	}

}
