/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;

import Business.DataConfig.EscolheRepositorio;
import Business.DataConfig.FabricaRepositorio;
import Comuns.basis.EntidadesDisponiveis;
import Comuns.vos.Usuario;
import DAO.basis.Repositorio;
import java.sql.SQLException;

/**
 *
 * @author joao-
 */
public class CadUsuario {
    public boolean InsereUsuario(Usuario user){
        boolean retorno = true;
        
        try {
            Repositorio repositorio = EscolheRepositorio.Fabrica();
            repositorio.inserir(user, EntidadesDisponiveis.USUARIO);
        } catch (SQLException ex) {
            retorno = false;
        }
        
        return retorno;
    }
}
