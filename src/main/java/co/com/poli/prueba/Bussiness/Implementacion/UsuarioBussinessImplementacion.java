/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.prueba.Bussiness.Implementacion;

import co.com.poli.prueba.Bussiness.IusuarioBussiness;
import co.com.poli.prueba.dao.Implementacion.Usuariodaoimplementacion;
import co.com.poli.prueba.model.Usuario;
import java.util.List;

/**
 *
 * @author CATALINA
 */
public class UsuarioBussinessImplementacion implements IusuarioBussiness
{
    Usuariodaoimplementacion usuarioDaoImpl = new Usuariodaoimplementacion();

    @Override
    public List<Usuario> obtenerListaUsuarios() 
    {
        return usuarioDaoImpl.obtenerListaUsuarios();
    }

    @Override
    public Usuario obtenerUsuario(String documento) 
    {
        return usuarioDaoImpl.obtenerUsuario(documento);
    }

    @Override
    public String crearUsuario(Usuario usuario) 
    {
        String msj= "usuario ya existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        if(user!= null)
        {
            msj = usuarioDaoImpl.crearUsuario(usuario);
        }
        return msj;
    }

    @Override
    public String modificarUsuario(Usuario usuario) 
    {
        String msj= "usuario no existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        if(user!= null)
        {
            msj = usuarioDaoImpl.modificarUsuario(usuario);
        }
        return msj;
    }

    @Override
    public String eliminarUsuario(String documento) 
    {
        String msj= "usuario no existe";
        Usuario user = obtenerUsuario(documento);
        if(user!= null)
        {
            msj = usuarioDaoImpl.eliminarUsuario(documento);
        }
        return msj;
    }
    
}
