/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DIONECENA
 */
public class Itineraire {
    private int id;
    private String nom;
    private String zone;

    public Itineraire() {}

    public Itineraire(int id, String nom, String zone) {
        this.id = id;
        this.nom = nom;
        this.zone = zone;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getZone() { return zone; }
    public void setZone(String zone) { this.zone = zone; }
}
