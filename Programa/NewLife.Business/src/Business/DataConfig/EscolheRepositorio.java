/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DataConfig;

import Comuns.basis.TipoRepositorio;
import DAO.basis.Repositorio;
import DAO.repositorioSQL.RepositorioSQL;

/**
 *
 * @author joao-
 */
public class EscolheRepositorio {
    public static Repositorio Fabrica() {
        if (Config.getInstance().getTipoRepositorio() == TipoRepositorio.MYSQL)
            return new RepositorioSQL();
        else 
            return null;
    }
}