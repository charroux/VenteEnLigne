package test;

import application.impl.CommanderComposant;
import application.impl.Recherche2;
import application.impl.RechercheComposant;

public class Main {

	public static void main(String[] args) {
		RechercheComposant recherche = new RechercheComposant();
		CommanderComposant commande = new CommanderComposant();
		commande.setRecherche(recherche);
		
		float montant = commande.addProduit(1);
		System.out.println("Montant du pannier = " + montant);
		
		// remplacement du composant RechercheComposant par le composant Recherche2
		// l'utilisation de la méthode setRecherche permet de ne pas toucher au code
		// du composant CommanderComposant
		Recherche2 recherche2 = new Recherche2();
		commande.setRecherche(recherche2);
		
	}

}
