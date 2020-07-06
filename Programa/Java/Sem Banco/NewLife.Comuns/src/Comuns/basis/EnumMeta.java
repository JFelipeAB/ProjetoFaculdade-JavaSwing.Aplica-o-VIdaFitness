/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.basis;

/**
 *
 * @author joao-
 * Equilíbrio saudável
Ganho de massa magra
Perda de peso
Perda de gordura
 */
public enum EnumMeta {
    Pp("Perda de peso"),
    Pg("Perda de gordura"),
    Gmm("Ganho de massa magra"),
    Es("Equilíbrio saudável");

    private String descricao;

    EnumMeta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
