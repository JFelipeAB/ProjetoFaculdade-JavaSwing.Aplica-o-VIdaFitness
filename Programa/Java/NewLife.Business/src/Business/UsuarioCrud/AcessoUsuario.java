/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;


import Comuns.vos.Usuario;
import DAO.DAOs.UsuarioDAO;

/**
 *
 * @author joao-
 */
public class AcessoUsuario {
    private static AcessoUsuario uniqueInstance;
 
    private AcessoUsuario() {
    }
    private static Usuario usuarioLogado;
    
    
    public static synchronized AcessoUsuario getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new AcessoUsuario();
 
        return uniqueInstance;
    }
       
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * 
     */
     public void setUsuarioLogado(Usuario u){
        usuarioLogado = u;
    }
    
}

    