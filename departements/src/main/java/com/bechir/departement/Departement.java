package com.bechir.departement;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	public class Departement {	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id_Departement;
		private String Nom_Departement;
		private int Nombre_employee;
		private Date dateAffectation;
		
	
		
		
		public Departement() {
		}





		public Departement( String nom_Departement, int nombre_employee, Date dateAffectation) {
			Nom_Departement = nom_Departement;
			Nombre_employee = nombre_employee;
			this.dateAffectation = dateAffectation;
		}


		


		public Long getId_Departement() {
			return id_Departement;
		}


		public void setId_Departement(Long id_Departement) {
			this.id_Departement = id_Departement;
		}


		public String getNom_Departement() {
			return Nom_Departement;
		}


		public void setNom_Departement(String nom_Departement) {
			Nom_Departement = nom_Departement;
		}

		public int getNombre_employee() {
			return Nombre_employee;
		}


		public void setNombre_employee(int nombre_employee) {
			Nombre_employee = nombre_employee;
		}


		public Date getDateAffectation() {
			return dateAffectation;
		}


		public void setDateAffectation(Date dateAffectation) {
			this.dateAffectation = dateAffectation;
		}


		@Override
		public String toString() {
			return "Departement [id_Departement=" + id_Departement + ", Nom_Departement=" + Nom_Departement
					+ ", Nombre_employee=" + Nombre_employee + ", dateAffectation=" + dateAffectation + "]";
		}
		

	

}
