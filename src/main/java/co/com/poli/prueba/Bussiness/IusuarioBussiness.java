/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.prueba.Bussiness;

import co.com.poli.prueba.model.Usuario;
import java.util.List;

/**
 *
 * @author CATALINA
 */
public interface IusuarioBussiness 
{
    List<Usuario> obtenerListaUsuarios();
    Usuario obtenerUsuario(String documento);
    String crearUsuario(Usuario usuario);
    String modificarUsuario(Usuario usuario);
    String eliminarUsuario(String documento);
}
