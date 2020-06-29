/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.basis;
import Comuns.vos.Usuario;

/**
 *
 * @author joao-
 */
public class CriaEntidades {
    public static Entidade CriaEntidade(EnumAbasDisponiveis entidade){
        
        Entidade entidadeRetorno;
        
        switch (entidade){
            case USUARIO:
                entidadeRetorno = new Usuario();
                break;
            default:
                entidadeRetorno = new Entidade();
                break;          
        }
        return entidadeRetorno;
    }
}
