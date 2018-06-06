/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.prueba.data;

import co.com.poli.prueba.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CATALINA
 */
public class Usuariodata 
{
    private static List<Usuario> listaUsuario;
    static
    {
        listaUsuario = new ArrayList<Usuario>()
        {
            
            {add(new Usuario("123","pepito","perez","pepo@mail.com","123","admin",Boolean.TRUE));}
            {add(new Usuario("456","pepita","perez","pepo@mail.com","123","admin",Boolean.TRUE));}
            {add(new Usuario("678","pepota","perez","pepo@mail.com","123","admin",Boolean.TRUE));}
        };
        
    }

    public static List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public static void setListaUsuario(List<Usuario> listaUsuario) {
        Usuariodata.listaUsuario = listaUsuario;
    }
    
    
    
}
