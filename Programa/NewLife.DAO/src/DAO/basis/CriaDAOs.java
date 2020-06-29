/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.basis;

import Comuns.basis.EnumAbasDisponiveis;
import static Comuns.basis.EnumAbasDisponiveis.USUARIO;
import Comuns.basis.TipoRepositorio;
import DAO.usuarioSQL.UsuarioDAO;

/**
 *
 * @author joao-
 */
public class CriaDAOs {
    public static DAO Fabrica(EnumAbasDisponiveis enumEntidade, TipoRepositorio repositorio) {
        switch (repositorio)
        {
            case MYSQL:
                return montaDAOMySQL(enumEntidade);
            default:
                return null;
        }
    }
    
    private static DAO montaDAOMySQL(EnumAbasDisponiveis enumEntidade) {
        DAO retorno;

        switch (enumEntidade)
        {
            
            case USUARIO:
                retorno = new UsuarioDAO();
                break;

            default:
                retorno = null;
                break;
        }

        return retorno;    
    }
}
