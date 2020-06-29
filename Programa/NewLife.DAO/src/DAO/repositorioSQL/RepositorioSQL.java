/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.repositorioSQL;

import Comuns.basis.Entidade;
import Comuns.basis.EnumAbasDisponiveis;
import Comuns.basis.TipoRepositorio;
import DAO.basis.CriaDAOs;
import DAO.basis.DAO;
import DAO.basis.Repositorio;
import java.sql.SQLException;

/**
 *
 * @author joao-
 */
public class RepositorioSQL extends Repositorio {
    @Override
    public Entidade consultar(int id, EnumAbasDisponiveis tipoEntidade) throws SQLException {
        DAO dao = CriaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        Entidade entidade = dao.consultar(id);

        return entidade;
    }
    
    @Override
    public Entidade consultar(String usuario, EnumAbasDisponiveis tipoEntidade) throws SQLException {
        DAO dao = CriaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        Entidade entidade = dao.consultar(usuario);

        return entidade;
    }

    @Override
    public void inserir(Entidade entidade, EnumAbasDisponiveis tipoEntidade) throws SQLException {
        DAO dao = CriaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        dao.inserir(entidade);
    }

    @Override
    public void atualizar(Entidade entidade, EnumAbasDisponiveis tipoEntidade) throws SQLException {
        DAO dao = CriaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        dao.atualizar(entidade);
    }

    @Override
    public void deletar(int id, EnumAbasDisponiveis tipoEntidade) throws SQLException {
        DAO dao = CriaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        dao.deletar(id);
    } 
}

