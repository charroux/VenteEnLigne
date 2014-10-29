package application;

public interface Commander {
	
	/**
	 * Ajoute un produit au pannier du client
	 * @param idProduit l'identifiant du produit
	 * @return montant du pannier
	 */
	float addProduit(long idProduit);
	
	/**
	 * Supprime un produit du pannier.
	 * @param idProduit l'identifiant du produit
	 * @return montant du pannier
	 */
	float deleteProduit(long idProduit);
}
