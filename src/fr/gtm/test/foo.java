package fr.gtm.test;

import fr.gtm.monopoly.Pion;

public class foo {
	public Case(String nom) {
		this.nom = nom;
	}
	
	public void survoler(Pion p) {
		System.out.println("SURVOL de "+nom+" par "+p.getNom());
	}
	
	public void arreter(Pion p) {
		System.out.println("ARRET sur "+nom+" par "+p.getNom());
	}
}
