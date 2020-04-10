/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DataConfig;

/**
 *
 * @author joao-
 */
public class FabricaRepositorio {
    public static Repositorio Fabrica() {
        if (Config.getInstance().getTipoRepositorio() == TipoRepositorio.MYSQL)
            return new RepositorioMySQL();
        else 
            return null;
    }
}
