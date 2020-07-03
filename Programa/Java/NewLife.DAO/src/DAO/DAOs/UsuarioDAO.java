/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.DAOs;


import DAO.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Comuns.vos.Usuario;

/**
 *
 * @author ighor
 */
public class UsuarioDAO {
    public static void Insert(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO USUARIO(usuario,senha,nome,endereco,cidade,estado,idade,peso,altura,gordura,gorduraDesejada,lvlTreino,meta,pesoDesejada,imc)" +
                                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, u.getUsuario());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getNome());
            stmt.setString(4, u.getEndereco());
            stmt.setString(5, u.getCidade());
            stmt.setString(6, u.getEstado());
            stmt.setInt(7, u.getIdade());
            stmt.setDouble(8, u.getPeso());
            stmt.setDouble(9, u.getAltura());
            stmt.setDouble(10, u.getGordura());
            stmt.setDouble(11, u.getGorduraDesejada());
            stmt.setString(12, u.getLvlTreino());
            stmt.setString(13, u.getMeta());
            stmt.setDouble(14, u.getPesoDesejada());
            stmt.setDouble(15, u.getImc());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static Usuario Select(String user){
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario u = new Usuario();
        
        try {
            stmt = con.prepareStatement("SELECT " +user +
                                        " FROM USUARIO");
            rs = stmt.executeQuery();
            
                
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setEndereco(rs.getString("endereco"));
                u.setCidade(rs.getString("cidade"));
                u.setEstado(rs.getString("estado"));
                u.setIdade(rs.getInt("idade"));
                u.setPeso(rs.getDouble("peso"));
                u.setAltura(rs.getDouble("altura"));
                u.setGordura(rs.getDouble("gordura"));
                u.setGorduraDesejada(rs.getDouble("gorduraDesejada"));
                u.setLvlTreino(rs.getString("lvlTreino"));
                u.setMeta(rs.getString("meta"));
                u.setPesoDesejada(rs.getDouble("pesoDesejada"));
                u.setImc(rs.getDouble("imc"));
               
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return u;
    }
}
