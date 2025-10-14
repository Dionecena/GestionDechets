/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;
/**
 *
 * @author DIONECENA
 */



public class Collecte {
    private int id;
    private Date dateCollecte;
    private double quantite;
    private String lieu;
    private TypeDechet typeDechet;
    private Itineraire itineraire;
    private Utilisateur utilisateur;

    public Collecte() {}

    public Collecte(int id, Date dateCollecte, double quantite, String lieu, TypeDechet typeDechet, Itineraire itineraire, Utilisateur utilisateur) {
        this.id = id;
        this.dateCollecte = dateCollecte;
        this.quantite = quantite;
        this.lieu = lieu;
        this.typeDechet = typeDechet;
        this.itineraire = itineraire;
        this.utilisateur = utilisateur;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDateCollecte() { return dateCollecte; }
    public void setDateCollecte(Date dateCollecte) { this.dateCollecte = dateCollecte; }

    public double getQuantite() { return quantite; }
    public void setQuantite(double quantite) { this.quantite = quantite; }

    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }

    public TypeDechet getTypeDechet() { return typeDechet; }
    public void setTypeDechet(TypeDechet typeDechet) { this.typeDechet = typeDechet; }

    public Itineraire getItineraire() { return itineraire; }
    public void setItineraire(Itineraire itineraire) { this.itineraire = itineraire; }

    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}

