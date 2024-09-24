package fr.tpspringboot.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Voitures")
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String immatriculation;
	
	@Column
	private String marque;
	
	@Column
	private String modele;
	
	@Column
	private String etat;
	
	public Car() {
		super();
	}
	

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	

	@Override
	public String toString() {
		return "Car [immatriculation=" + immatriculation + ", marque=" + marque + ", modele=" + modele + ", etat="
				+ etat + "]";
	}

}
