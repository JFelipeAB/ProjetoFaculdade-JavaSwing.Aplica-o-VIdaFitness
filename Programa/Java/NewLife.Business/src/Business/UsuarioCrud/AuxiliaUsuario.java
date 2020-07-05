/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsuarioCrud;
import Comuns.basis.EnumMeta;
import Comuns.basis.EnumNvlTreino;
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
    public static String FidBackIMC()
    {
        Usuario u = AcessoUsuario.getInstance().getUsuarioLogado();
        if(u.getImc() < 18.5)
                return("IMC: abaixo do peso");
             else if(u.getImc() < 24.9 || u.getGordura()< 15 )
                return("IMC: peso normal");
             else if(u.getImc() < 29.9)
                return("IMC: SobrePeso");
             else
                return("IMC: Obesidade");
    }
    public static ArrayList<String> UsuarioTreino()
    {
        ArrayList<String> treino = new ArrayList();
        String uTreino = AcessoUsuario.getInstance().getUsuarioLogado().getLvlTreino();
        String uDieta = AcessoUsuario.getInstance().getUsuarioLogado().getMeta();
        if(uTreino.equals(EnumNvlTreino.Ic.getDescricao()))
        {
            if(uDieta.equals(EnumMeta.Pp.getDescricao()) || uDieta.equals(EnumMeta.Pg.getDescricao()))
            {
                treino.add(EnumTreino.Iniciante1.getDescricao());
                treino.add(EnumTreino.Iniciante2.getDescricao());
                treino.add(EnumTreino.Iniciante4.getDescricao());
            }
            else if(uDieta.equals(EnumMeta.Es.getDescricao())|| uDieta.equals(EnumMeta.Gmm.getDescricao()))
            {
                treino.add(EnumTreino.Iniciante2.getDescricao());
                treino.add(EnumTreino.Iniciante3.getDescricao());
                treino.add(EnumTreino.Iniciante4.getDescricao());
            }
        }
        else if(uTreino.equals(EnumNvlTreino.It.getDescricao()))
        {
            if(uDieta.equals(EnumMeta.Pp.getDescricao()) || uDieta.equals(EnumMeta.Pg.getDescricao()))
            {
                treino.add(EnumTreino.Avançado1.getDescricao());
                treino.add(EnumTreino.Intermediario2.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
            }
            else if(uDieta.equals(EnumMeta.Es.getDescricao()))
            {
                treino.add(EnumTreino.Iniciante1.getDescricao());
                treino.add(EnumTreino.Intermediario2.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
            }
            else if(uDieta.equals(EnumMeta.Gmm.getDescricao()))
                {
                treino.add(EnumTreino.Intermediario2.getDescricao());
                treino.add(EnumTreino.Avançado3.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
            }
        }
        else if(uTreino.equals(EnumNvlTreino.Av.getDescricao()))
        {
            if(uDieta.equals(EnumMeta.Pp.getDescricao()))
            {
                treino.add(EnumTreino.Avançado1.getDescricao());
                treino.add(EnumTreino.Intermediario4.getDescricao());
                treino.add(EnumTreino.Intermediario1.getDescricao());
            }
            else if (uDieta.equals(EnumMeta.Pg.getDescricao()))
            {
                treino.add(EnumTreino.Intermediario1.getDescricao());
                treino.add(EnumTreino.Avançado2.getDescricao());
                treino.add(EnumTreino.Avançado3.getDescricao());
            }
            else if(uDieta.equals(EnumMeta.Es.getDescricao()))
            {
                treino.add(EnumTreino.Intermediario1.getDescricao());
                treino.add(EnumTreino.Avançado2.getDescricao());
                treino.add(EnumTreino.Avançado4.getDescricao());
            }
            else if(uDieta.equals(EnumMeta.Gmm.getDescricao()))
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
        if(uDieta.equals(EnumMeta.Pp.getDescricao()) || uDieta.equals(EnumMeta.Pg.getDescricao()))
        {
            dieta.add(uPeso*3);
            dieta.add(uPeso*0.7);
            dieta.add(uPeso*0.4);
            dieta.add(3500.0);
        }
        else if(uDieta.equals(EnumMeta.Es.getDescricao()))
        {
            dieta.add(uPeso*3.5);
            dieta.add(uPeso*0.75);
            dieta.add(uPeso*0.5);
            dieta.add(3000.0);
        }
        else if(uDieta.equals(EnumMeta.Gmm.getDescricao()))
        {
            dieta.add(uPeso*4);
            dieta.add(uPeso*1);
            dieta.add(uPeso*0.45);
            dieta.add(3500.0);
        }
        return dieta;
    }
    public static String DicaDia()
    {
    return "Se alimente bem e tome muita agua";
    }
}
