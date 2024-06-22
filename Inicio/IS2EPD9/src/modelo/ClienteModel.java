package modelo;

import modelo.entidades.Cliente;
import controlador.ClienteController;
import java.util.List;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface ClienteModel {
    //Enlaces con el controlador
    public ClienteController getController();
    public void setController(ClienteController controller);

    //Funciones que debe permitir el modelo
    public void nuevoCliente(Cliente cliente);
    public Cliente obtenerCliente(String nombre);
    public void eliminarCliente(Cliente cliente);
    public void actualizarCliente(Cliente cliente);
    public List<Cliente> obtenerClientes();
}
