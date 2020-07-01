/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;

import Comuns.basis.EnumTreino;
import Comuns.vos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author joao-
 */
public class AuxiliaUsuario {
    public static double UsuarioMeta()
    {
        Usuario u = CrudUsuario.getInstance();
        double imc = u.getPeso()/(u.getAltura()*u.getAltura());
        u.setImc(imc);
        return imc;
    }
    
    public static ArrayList<String> UsuarioTreino()
    {
        ArrayList<String> treino = new ArrayList();
        String uTreino = CrudUsuario.getInstance().getLvlTreino();
        String uDieta = CrudUsuario.getInstance().getMeta();
        if(uTreino.toUpperCase().equals("INICIANTE"))
        {
            if(uDieta.toUpperCase().equals("PERDA DE PESO") || uDieta.toUpperCase().equals("PERDA DE GORDURA"))
            {
                treino.add(EnumTreino.Iniciante1.getDescricao());
                treino.add(EnumTreino.Iniciante2.getDescricao());
                treino.add(EnumTreino.Iniciante4.getDescricao());
            }
            else if(uDieta.toUpperCase().equals("EQUILIBRIO SAUDAVEL") || uDieta.toUpperCase().equals("GANHO DE MASSA MAGRA"))
            {
                treino.add(EnumTreino.Iniciante2.getDescricao());
                treino.add(EnumTreino.Iniciante3.getDescricao());
                treino.add(EnumTreino.Iniciante4.getDescricao());
            }
        }
        else if(uTreino.toUpperCase().equals("INTERMEDIARIO"))
        {
            if(uDieta.toUpperCase().equals("PERDA DE PESO") || uDieta.toUpperCase().equals("PERDA DE GORDURA"))
            {
                treino.add(EnumTreino.Avançado1.getDescricao());
                treino.add(EnumTreino.Intermediario2.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
            }
            else if(uDieta.toUpperCase().equals("EQUILIBRIO SAUDAVEL"  ))
            {
                treino.add(EnumTreino.Iniciante1.getDescricao());
                treino.add(EnumTreino.Intermediario2.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
            }
            else if(uDieta.toUpperCase().equals("GANHO DE MASSA MAGRA"))
                {
                treino.add(EnumTreino.Intermediario2.getDescricao());
                treino.add(EnumTreino.Avançado3.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
            }
        }
        else if(uTreino.toUpperCase().equals("INTERMEDIARIO"))
        {
            if(uDieta.toUpperCase().equals("PERDA DE PESO")  )
            {
                treino.add(EnumTreino.Avançado1.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
                treino.add(EnumTreino.Intermediario1.getDescricao());
            }
            else if (uDieta.toUpperCase().equals("PERDA DE GORDURA"))
            {
                treino.add(EnumTreino.Intermediario1.getDescricao());
                treino.add(EnumTreino.Avançado2.getDescricao());
                treino.add(EnumTreino.Avançado3.getDescricao());
            }
            else if(uDieta.toUpperCase().equals("EQUILIBRIO SAUDAVEL"  ))
            {
                treino.add(EnumTreino.Intermediario1.getDescricao());
                treino.add(EnumTreino.Avançado2.getDescricao());
                treino.add(EnumTreino.Avançado4.getDescricao());
            }
            else if(uDieta.toUpperCase().equals("GANHO DE MASSA MAGRA"))
            {
                treino.add(EnumTreino.Avançado2.getDescricao());
                treino.add(EnumTreino.Avançado3.getDescricao());
                treino.add(EnumTreino.Avançado4.getDescricao());
            }
        }
        return treino;
    }
    public static ArrayList<Double> UsuarioDieta()
    {
        ArrayList<Double> dieta = new ArrayList();
//        String uTreino = CrudUsuario.getInstance().getLvlTreino();
        String uDieta = CrudUsuario.getInstance().getMeta();
        Double uPeso = CrudUsuario.getInstance().getPeso();
        double agua= 3500;
        if(uDieta.toUpperCase().equals("PERDA DE PESO") || uDieta.toUpperCase().equals("PERDA DE GORDURA"))
        {
            dieta.add(uPeso*3);
            dieta.add(uPeso*0.7);
            dieta.add(uPeso*0.4);
            dieta.add(agua);
        }
        else if(uDieta.toUpperCase().equals("EQUILIBRIO SAUDAVEL"  ))
        {
            dieta.add(uPeso*3.5);
            dieta.add(uPeso*0.75);
            dieta.add(uPeso*0.5);
            dieta.add(agua);
        }
        else if(uDieta.toUpperCase().equals("GANHO DE MASSA MAGRA"))
        {
            dieta.add(uPeso*4);
            dieta.add(uPeso*1);
            dieta.add(uPeso*0.45);
            dieta.add(agua);
        }
        return dieta;
    }
}
