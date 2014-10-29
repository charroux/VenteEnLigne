package application.impl;

import java.util.List;

import application.Categorie;
import application.Produit;
import application.Recherche;

/**
 * Premi�re implantation du composant de recherche
 * @author ben
 *
 */
public class RechercheComposant implements Recherche{

	@Override
	public List<Produit> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Implantation d'un objet mock (bouchon) qui pour tester l'application retourne
	 * toujours le m�me produit
	 */
	@Override
	public Produit findById(long idProduit) {
		return new Produit(idProduit, "nom du produit", 1);
	}

}
