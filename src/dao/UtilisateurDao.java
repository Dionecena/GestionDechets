/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.*;
import models.*;
import services.DatabaseService;
import java.sql.*;
/**
 *
 * @author Ababacar
 */




public class UtilisateurDao {

    private RoleDao roleDao = new RoleDao();

    public Utilisateur getUtilisateurById(int id) {
        Utilisateur user = null;
        try {
            Connection con = DatabaseService.getConnection();
            String query = "SELECT * FROM utilisateurs WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Role role = roleDao.getRoleById(rs.getInt("role_id"));
                user = new Utilisateur(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("email"),
                    rs.getString("mot_de_passe"),
                    role
                );
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<Utilisateur> getAllUtilisateurs() {
        List<Utilisateur> users = new ArrayList<>();
        try {
            Connection con = DatabaseService.getConnection();
            String query = "SELECT * FROM utilisateurs";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Role role = roleDao.getRoleById(rs.getInt("role_id"));
                Utilisateur user = new Utilisateur(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("email"),
                    rs.getString("mot_de_passe"),
                    role
                );
                users.add(user);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}

