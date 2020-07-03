/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;
import DAO.DAOs.UsuarioDAO;
import Comuns.vos.Usuario;
/**
 *
 * @author joao-
 */
public class CrudUsuario {
    
    public static void NewkUser(String user, String password)
    {
    Usuario uNovo = new Usuario();
    uNovo.setAltura(0.00);
    uNovo.setCidade("Preencha seus dados");
    uNovo.setEndereco("Preencha seus dados");
    uNovo.setEstado("Sigla do estado");
    uNovo.setIdade(0);
    uNovo.setGorduraDesejada(0);
    uNovo.setImc(0);
    uNovo.setNome("Preencha seus dados");
    uNovo.setMeta("");
    uNovo.setLvlTreino("");
    uNovo.setGordura(0);    
    uNovo.setPeso(0);
    uNovo.setPesoDesejada(0);
    uNovo.setSenha(password);
    uNovo.setUsuario(user);
    }
    
    public static Usuario CheckUser(String user, String password)
    {    
//        Usuario uCheck = UsuarioDAO.Select(user);
//        if(uCheck != null)
//        {
//            if(uCheck.getUsuario().equals(user) & uCheck.getSenha().equals(password))
//                return uCheck;
//        }
//        return null;//        
        
        Usuario u = new Usuario();//quebra galho
        u.setUsuario(user);//quebra galho 
            if(!u.getUsuario().equals("admin"))//quebra galho 
                return null;//quebra galho
        return u;//quebra galho        
    }
    public static Usuario CheckUser(String user)
    {    
        Usuario uCheck = UsuarioDAO.Select(user);
        return uCheck;         
    }
    public static void Alterar (Usuario u)
    {
        
    }
}
