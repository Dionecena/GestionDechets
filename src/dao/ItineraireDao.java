/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import models.Itineraire;
import services.DatabaseService;
/**
 *
 * @author DIONECENA
 */



public class ItineraireDao {

    public Itineraire getItineraireById(int id) {
        Itineraire itineraire = null;
        try {
            Connection con = DatabaseService.getConnection();
            String query = "SELECT * FROM itineraires WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                itineraire = new Itineraire(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("zone")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itineraire;
    }
}

