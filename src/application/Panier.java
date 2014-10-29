package application;

import java.util.ArrayList;

public class Panier {
	
	long idCommande;
	ArrayList<Produit> panier = new ArrayList<Produit>();

	public Panier(long idCommande) {
		super();
		this.idCommande = idCommande;
	}

	public void add(Produit produit) {
		panier.add(produit);
	}

	public int size() {
		return panier.size();
	}

	public Produit get(int i) {
		return panier.get(i);
	}

	public ArrayList<Produit> getPanier() {
		return panier;
	}

	public void setPanier(ArrayList<Produit> panier) {
		this.panier = panier;
	}

	public long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}

	public float getMontant() {
		float montant = 0;
		for(int i=0; i<panier.size(); i++){
			montant = montant + panier.get(i).getPrix();
		}
		return montant;
	}
	
	

}
