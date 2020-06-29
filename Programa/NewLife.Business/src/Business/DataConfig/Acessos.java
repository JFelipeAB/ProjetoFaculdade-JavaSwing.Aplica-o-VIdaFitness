/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DataConfig;
import Comuns.basis.EnumAbasDisponiveis;
import Comuns.vos.Usuario;
import DAO.basis.Repositorio;
import java.sql.SQLException;

/**
 *
 * @author joao-
 */
 public class Acessos {
    private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }

    public boolean validaUsuario(Usuario user) throws SQLException {
        boolean retorno = false;
        Repositorio repositorio = EscolheRepositorio.Fabrica();        
        Usuario usuario = (Usuario)repositorio.consultar(user.getUsuario(), EnumAbasDisponiveis.USUARIO);

        if (usuario != null) {
            retorno = validaSenha(usuario.getSenha(), user.getSenha());
        }

        return retorno;
    }
}
