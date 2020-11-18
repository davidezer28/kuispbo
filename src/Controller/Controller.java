/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Controller;
import Model.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hanschristian
 */
public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    public static ArrayList<Mahasiswa> getAllMahasiswa() {
        ArrayList<Mahasiswa> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(rs.getString("Nim"));
                mahasiswa.setNama(rs.getString("Nama"));
                mahasiswa.setAngkatan(rs.getInt("Angkatan"));
                mahasiswa.setKodejurusan(rs.getString("Kode Jurusan"));
                mahasiswa.add(mahasiswa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    public static Mahasiswa getMahasiswa(String nama, int angkatan) {
        conn.connect();
        String query = "SELECT * FROM users WHERE KodeJurusan='" + kode_jurusan + "'";
        Mahasiswa mahasiswa = new Mahasiswa();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                mahasiswa.setNim(rs.getString("Nim"));
                mahasiswa.setNama(rs.getString("Nama"));
                mahasiswa.setAngkatan(rs.getInt("Angkatan"));
                mahasiswa.setKodejurusan(rs.getString("Kode Jurusan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (mahasiswa);
    }
    
    // INSERT
    public static boolean insertNewMahasiswa(Mahasiswa mahasiswa) {
        conn.connect();
        String query = "INSERT INTO users VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, mahasiswa.getNim());
            stmt.setString(2, mahasiswa.getNama());
            stmt.setInt(3, mahasiswa.getAngkatan());
            stmt.setString(4, mahasiswa.getKodejurusan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}

