/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.basis;

/**
 *
 * @author joao-
 */
public enum EnumAbasDisponiveis {
    Treino("treino"),
    Alimentacao("Alimentacao"),
    Sobre("Sobre"),
    Perfil("Perfil");

    private String descricao;

    EnumAbasDisponiveis(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
