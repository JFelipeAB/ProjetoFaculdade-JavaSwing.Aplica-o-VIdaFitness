/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.DAOs;

import DAO.bean.Usuario;
import DAO.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ighor
 */
public class UsuarioDAO {
    public void create(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO USUARIO(nome_usuario,senha,nome,endereco,cidade,estado,idade,peso,altura,qtd_gordura,sexo)" +
                                        "VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, u.getNome_usuario());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getNome());
            stmt.setString(4, u.getEndereco());
            stmt.setString(5, u.getCidade());
            stmt.setString(6, u.getEstado());
            stmt.setInt(7, u.getIdade());
            stmt.setInt(8, u.getPeso());
            stmt.setDouble(9, u.getAltura());
            stmt.setInt(10, u.getQtd_gorduta());
            stmt.setString(11, u.getSexo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Usuario> listar(){
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT *" +
                                        "FROM USUARIO");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                
                u.setId_usuario(rs.getInt("id_usuario"));
                u.setNome_usuario(rs.getString("nome_usuario"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setEndereco(rs.getString("endereco"));
                u.setCidade(rs.getString("cidade"));
                u.setEstado(rs.getString("estado"));
                u.setIdade(rs.getInt("idade"));
                u.setPeso(rs.getInt("peso"));
                u.setAltura(rs.getDouble("altura"));
                u.setQtd_gorduta(rs.getInt("qtd_gordura"));
                u.setSexo(rs.getString("sexo"));
                
                usuarios.add(u);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
    }
}
