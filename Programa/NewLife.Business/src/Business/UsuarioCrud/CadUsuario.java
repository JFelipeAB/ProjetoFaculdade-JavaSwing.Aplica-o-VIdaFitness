/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;

import Business.DataConfig.FabricaRepositorio;

/**
 *
 * @author joao-
 */
public class CadUsuario {
    public boolean InsereUsuario(Usuario user){
        boolean retorno = true;
        
        try {
            Repositorio repositorio = FabricaRepositorio.Fabrica();
            repositorio.inserir(user, EntidadesDisponiveis.USUARIO);
        } catch (SQLException ex) {
            retorno = false;
        }
        
        return retorno;
    }
}
