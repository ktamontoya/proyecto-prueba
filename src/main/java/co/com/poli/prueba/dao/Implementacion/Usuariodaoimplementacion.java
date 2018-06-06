/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.prueba.dao.Implementacion;

import co.com.poli.prueba.dao.Iusuariodao;
import co.com.poli.prueba.data.Usuariodata;
import co.com.poli.prueba.model.Usuario;
import java.util.List;

/**
 *
 * @author CATALINA
 */
public class Usuariodaoimplementacion implements  Iusuariodao
{

    @Override
    public List<Usuario> obtenerListaUsuarios() 
    {
        return Usuariodata.getListaUsuario();
        
    }

    @Override
    public Usuario obtenerUsuario(String documento) 
    {
        Usuario  usuario = null;
        List<Usuario> listaUsuarios = Usuariodata.getListaUsuario();
        for(Usuario userLista: listaUsuarios)
        {
            if(userLista.getDocumento().equals(documento))
            {
                usuario=userLista;
            }
        }
        
        return usuario;
    }

    @Override
    public String crearUsuario(Usuario usuario) 
    {
        List<Usuario> listaUsuarios = Usuariodata.getListaUsuario();
        listaUsuarios.add(usuario);
        Usuariodata.setListaUsuario(listaUsuarios);
        return "Usuario Creado";
    }

    @Override
    public String modificarUsuario(Usuario usuario) 
    {
        List<Usuario> listaUsuarios = Usuariodata.getListaUsuario();
        listaUsuarios.set(listaUsuarios.indexOf(usuario), usuario);
        Usuariodata.setListaUsuario(listaUsuarios);
        return "Usuario Modificado"; 
    }

    @Override
    public String eliminarUsuario(String documento) 
    {
        List<Usuario> listaUsuarios = Usuariodata.getListaUsuario();
        listaUsuarios.remove(obtenerUsuario(documento));
        Usuariodata.setListaUsuario(listaUsuarios);
        return "Usuario Eliminado"; 
    }
    
    
}
