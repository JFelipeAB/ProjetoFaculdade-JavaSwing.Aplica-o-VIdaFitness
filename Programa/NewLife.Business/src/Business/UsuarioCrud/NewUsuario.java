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
public class NewUsuario {
    public static boolean NovoUser(String user, String password)
    {    
    Usuario teste = DaoUsuario.select(user);
    if(teste.getUsuario().isEmpty())
        return false;
    teste = new Usuario();
    teste.setAltura(0.00);
    teste.setCidade("cidade");
    teste.setEndereco("sua rua");
    teste.setEstado("SIgla do estado");
    teste.setGorduraDesejada(0);
    teste.setImc(0);
    teste.setNome("Seu Nome");
    teste.setPeso(0);
    teste.setPesoDesejada(0);
    teste.setSenha(password);
    teste.setUsuario(user);
    DaoUsuario.insert(teste);
    return true;
    }
}
