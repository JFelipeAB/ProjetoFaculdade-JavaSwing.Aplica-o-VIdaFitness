/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.vos;

import Comuns.basis.Entidade;

/**
 *
 * @author joao-
 */
public class Usuario extends Entidade{

    
    private String usuario;
    private String senha;
    private String nome;
    private String endereco;
     private String cidade;
     private String estado;
     private int idade;
    private int peso;
    private int altura;
    private int gordura;
    
    private String meta;
    private String lvlTreino;
    private Double imc;
    private int gorduraDesejada;
    private int pesoDesejada;
    
    
    
        
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the username
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the username to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the gordura
     */
    public int getGordura() {
        return gordura;
    }

    /**
     * @param gordura the gordura to set
     */
    public void setGordura(int gordura) {
        this.gordura = gordura;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }

    /**
     * @return the gorduraDesejada
     */
    public int getGorduraDesejada() {
        return gorduraDesejada;
    }

    /**
     * @param gorduraDesejada the gorduraDesejada to set
     */
    public void setGorduraDesejada(int gorduraDesejada) {
        this.gorduraDesejada = gorduraDesejada;
    }

    /**
     * @return the pesoDesejada
     */
    public int getPesoDesejada() {
        return pesoDesejada;
    }

    /**
     * @param pesoDesejada the pesoDesejada to set
     */
    public void setPesoDesejada(int pesoDesejada) {
        this.pesoDesejada = pesoDesejada;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the meta
     */
    public String getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(String meta) {
        this.meta = meta;
    }

    /**
     * @return the lvlTreino
     */
    public String getLvlTreino() {
        return lvlTreino;
    }

    /**
     * @param lvlTreino the lvlTreino to set
     */
    public void setLvlTreino(String lvlTreino) {
        this.lvlTreino = lvlTreino;
    }
   
}
