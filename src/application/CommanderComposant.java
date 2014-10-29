package application;

import java.util.ArrayList;

public class CommanderComposant implements Commander{

	private Recherche recherche;
	
	ArrayList<Produit> panier = new ArrayList<Produit>();
	
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
		float montant = 0;
		for(int i=0; i<panier.size(); i++){
			montant = montant + panier.get(i).getPrix();
		}
		return montant;
	}

	@Override
	public float deleteProduit(long idProduit) {
		// TODO Auto-generated method stub
		return 0;
	}

}
