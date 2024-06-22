/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.List;
import modelo.ClienteModel;
import modelo.entidades.Cliente;
import vista.cliente.ClienteView;


/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface ClienteController extends Controller<ClienteModel, ClienteView, String>{
    
    public List<Cliente> listaClienteEntidadGesture ();
}
