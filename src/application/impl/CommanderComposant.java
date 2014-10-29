package application.impl;

import application.Commander;
import application.ModePaiement;
import application.Panier;
import application.Produit;
import application.Recherche;
import application.ReglerCommande;

public class CommanderComposant implements Commander, ReglerCommande{

	private Recherche recherche;
	
	static long idCommande = 0;
	
	private Panier panier;
	
	public CommanderComposant(){
		idCommande++;
		panier = new Panier(idCommande);
	}
	
	public Recherche getRecherche() {
		return recherche;
	}

	public void setRecherche(Recherche recherche) {
		this.recherche = recherche;
	}

	@Override
	public float addProduit(long idProduit) {
		Produit produit = recherche.findById(idProduit);
		panier.add(produit);
		return panier.getMontant();
	}

	@Override
	public float deleteProduit(long idProduit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Panier consulterPanier() {
		return panier;
	}

	@Override
	public float validerPanier() {
		return panier.getMontant();
	}

	@Override
	public void setAdresseLivraison(String adresse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setModePaiement(ModePaiement modePaiement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean payer() {
		// TODO Auto-generated method stub
		return false;
	}

}
