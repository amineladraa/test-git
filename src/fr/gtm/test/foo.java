package fr.gtm.test;

public class Foo {
private int valeur;
	public int getValeur() {
		return valeur;
	}
	
	public void lancer() {
		valeur = random.nextInt(6) + 1;
	}
}
