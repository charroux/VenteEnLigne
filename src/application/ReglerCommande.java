package application;

public interface ReglerCommande {
	
	Panier consulterPanier();
	/**
	 * 
	 * @param panier
	 * @return le montant du panier
	 */
	float validerPanier();
	void setAdresseLivraison(String adresse);
	void setModePaiement(ModePaiement modePaiement);
	/**
	 * 
	 * @param panier
	 * @return true si le paiement a été fait, false sinon
	 */
	boolean payer();
	

}
