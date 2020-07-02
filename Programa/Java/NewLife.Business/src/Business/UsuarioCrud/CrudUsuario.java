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
    private static CrudUsuario uniqueInstance;
 
    private CrudUsuario() {
    }
    private static Usuario usuarioLogado;
    
    
    public static synchronized CrudUsuario getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new CrudUsuario();
 
        return uniqueInstance;
    }
       
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * 
     */
     public boolean setUsuarioLogado(Usuario u){
        u.setAltura(0.00);
    u.setCidade("Preencha seus dados");
    u.setEndereco("Preencha seus dados");
    u.setEstado("SP");
    u.setIdade(0);
    u.setGorduraDesejada(0);
    u.setImc(0);
    u.setNome("Preencha seus dados");
    u.setMeta("");
    u.setLvlTreino("");
    u.setGordura(0);    
    u.setPeso(0);
    u.setPesoDesejada(0);
        try{
//            u = UsuarioDAO.Select(u.getUsuario(), u.getSenha());
        }
        catch(Exception ex)
        {
                       
        }           
        if(!u.getUsuario().equals("admin") )
            return false;
        usuarioLogado = u;
        return true;
    }
    public void Alterar (Usuario u)
    {
        usuarioLogado = u;
    }
}

    