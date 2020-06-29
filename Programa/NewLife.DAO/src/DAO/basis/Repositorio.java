/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.basis;

import Comuns.basis.Entidade;
import Comuns.basis.EnumAbasDisponiveis;
import java.sql.SQLException;

/**
 *
 * @author joao-
 */
public abstract class Repositorio {
    public abstract Entidade consultar(int id, EnumAbasDisponiveis tipoEntidade) throws SQLException;
    public abstract Entidade consultar(String valorCampo, EnumAbasDisponiveis tipoEntidade) throws SQLException;
    public abstract void inserir(Entidade entidade, EnumAbasDisponiveis tipoEntidade) throws SQLException;
    public abstract void atualizar(Entidade entidade, EnumAbasDisponiveis tipoEntidade) throws SQLException;
    public abstract void deletar(int id, EnumAbasDisponiveis tipoEntidade) throws SQLException;
}
