/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;

import DAO.usuarioSQL.DaoUsuario;
import Comuns.vos.Usuario;


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
       
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * @param acessoFuncionario the acessoFuncionario to set
     */
    static public boolean setUsuarioLogado(String user, String password){
        Usuario atual = DaoUsuario.select(user, password);
        if(atual.getUsuario().isEmpty() )
            return false;
        usuarioLogado = atual;
        return true;
    }
    static public void Alterar 
}

    