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
    public static double UsuarioIMC()
    {
        
        Usuario u = AcessoUsuario.getInstance().getUsuarioLogado();
        double alturaM =u.getAltura()/100.0;
        double imc = u.getPeso()/((alturaM)*(alturaM));
        u.setImc(imc);
        return imc;
    }
    
    public static ArrayList<String> UsuarioTreino()
    {
        ArrayList<String> treino = new ArrayList();
        String uTreino = AcessoUsuario.getInstance().getUsuarioLogado().getLvlTreino();
        String uDieta = AcessoUsuario.getInstance().getUsuarioLogado().getMeta();
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
//        String uTreino = AcessoUsuario.getInstance().getLvlTreino();
        String uDieta = AcessoUsuario.getInstance().getUsuarioLogado().getMeta();
        double uPeso = AcessoUsuario.getInstance().getUsuarioLogado().getPeso();        
        if(uDieta.toUpperCase().equals("PERDA DE PESO") || uDieta.toUpperCase().equals("PERDA DE GORDURA"))
        {
            dieta.add(uPeso*3);
            dieta.add(uPeso*0.7);
            dieta.add(uPeso*0.4);
            dieta.add(3500.0);
        }
        else if(uDieta.toUpperCase().equals("EQUILIBRIO SAUDAVEL"  ))
        {
            dieta.add(uPeso*3.5);
            dieta.add(uPeso*0.75);
            dieta.add(uPeso*0.5);
            dieta.add(3000.0);
        }
        else if(uDieta.toUpperCase().equals("GANHO DE MASSA MAGRA"))
        {
            dieta.add(uPeso*4);
            dieta.add(uPeso*1);
            dieta.add(uPeso*0.45);
            dieta.add(3500.0);
        }
        return dieta;
    }
}
