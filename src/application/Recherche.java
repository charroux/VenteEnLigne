package application;

import java.util.List;

public interface Recherche {
	
	List<Produit> findByNom(String nom);
	List<Produit> findByCategorie(Categorie categorie);
	Produit findById(long idProduit);

}
