package org.ensa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 */

/**
 * @author MinaGH
 *
 */
@ManagedBean(name = "commande")
@SessionScoped

public class Commande {
	private Date date;
	private float montant;
	private String modePaiement;
	private String statutPaiement;
	private String modeLivraison;
	private String statutLivraison;
	private List<Commande> commandes= new ArrayList<Commande>();
	
	public Commande() {
		super();
	}
	public Commande(Date date, float montant, String modePaiement, String statutPaiement, String modeLivraison,
			String statutLivraison) {
		super();
		this.date = date;
		this.montant = montant;
		this.modePaiement = modePaiement;
		this.statutPaiement = statutPaiement;
		this.modeLivraison = modeLivraison;
		this.statutLivraison = statutLivraison;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	public String getStatutPaiement() {
		return statutPaiement;
	}
	public void setStatutPaiement(String statutPaiement) {
		this.statutPaiement = statutPaiement;
	}
	public String getModeLivraison() {
		return modeLivraison;
	}
	public void setModeLivraison(String modeLivraison) {
		this.modeLivraison = modeLivraison;
	}
	public String getStatutLivraison() {
		return statutLivraison;
	}
	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison = statutLivraison;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	public void save() {
		Commande c=new Commande();
		c.date=date;
		c.montant=montant;
		c.modePaiement=modePaiement;
		c.statutPaiement=statutPaiement;
		c.modeLivraison=modeLivraison;
		c.statutLivraison=statutLivraison;
		commandes.add(c);
	}
	
	

}
