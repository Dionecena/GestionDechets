/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Role;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import services.DatabaseService;

/**
 *
 * @author Ababacar
 */


public class RoleDao {
    public Role getRoleById(int id) {
        Role role = null;
        try {
            Connection con = DatabaseService.getConnection();
            String query = "SELECT * FROM roles WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                role = new Role(rs.getInt("id"), rs.getString("nom"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }
}
