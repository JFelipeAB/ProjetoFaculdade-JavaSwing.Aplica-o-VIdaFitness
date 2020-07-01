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
public class NewUsuario {
    public static boolean NovoUser(String user, String password)
    { 
    Usuario teste = new Usuario();
        try{
    teste = UsuarioDAO.Select(user, password);
    }
    catch(Exception x)
    {
    }
    if(teste.getUsuario().isEmpty())
        return false;
    teste = new Usuario();
    teste.setAltura(0.00);
    teste.setCidade("Preencha seus dados");
    teste.setEndereco("Preencha seus dados");
    teste.setEstado("Sigla do estado");
    teste.setIdade(0);
    teste.setGorduraDesejada(0);
    teste.setImc(0);
    teste.setNome("Preencha seus dados");
    teste.setMeta("");
    teste.setLvlTreino("");
    teste.setGordura(0);    
    teste.setPeso(0);
    teste.setPesoDesejada(0);
    teste.setSenha(password);
    teste.setUsuario(user);
    try{
    UsuarioDAO.Insert(teste);
    }
    catch(Exception x)
    {
    }
    return true;
    }
}
