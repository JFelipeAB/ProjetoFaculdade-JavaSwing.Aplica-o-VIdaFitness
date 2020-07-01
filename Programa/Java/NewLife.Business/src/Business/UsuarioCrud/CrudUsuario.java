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
public class CrudUsuario {
    private static Usuario uniqueInstance;
 
    private CrudUsuario() {
    }
    private static Usuario usuarioLogado;
    
    
    public static synchronized Usuario getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Usuario();
 
        return uniqueInstance;
    }
       
    
    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * 
     */
     public static boolean setUsuarioLogado(String user, String password){
        Usuario atual = new Usuario();
        try{
//            atual = UsuarioDAO.Select(user, password);
        }
        catch(Exception ex)
        {
                       
        }
            Usuario aux = new Usuario();
            aux.setUsuario(user);
            aux.setSenha(password);
            atual = aux; 
        if(!atual.getUsuario().equals("admin") )
            return false;
        usuarioLogado = atual;
        return true;
    }
    public static void Alterar (Usuario u)
    {
        usuarioLogado = u;
    }
}

    