package com.bechir.departement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bechir.departement.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>{

}
