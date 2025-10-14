/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.*;
import models.TypeDechet;
import services.DatabaseService;
/**
 *
 * @author DIONECENA
 */

public class TypeDechetDao {

    public TypeDechet getTypeById(int id) {
        TypeDechet type = null;
        try {
            Connection con = DatabaseService.getConnection();
            String query = "SELECT * FROM types_dechets WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                type = new TypeDechet(rs.getInt("id"), rs.getString("nom"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return type;
    }
}

