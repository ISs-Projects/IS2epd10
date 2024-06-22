package controlador;

import java.util.List;
import modelo.ClienteModel;
import modelo.entidades.Cliente;
import vista.cliente.ClienteView;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface ClienteController {
    //Metodo para enlazar la vista y el modelo
    public void setup(ClienteModel model, List<ClienteView> view);
    //Metodo para lanzar la aplicación MVC
    public void start();

    public void addView(ClienteView view);
    public void removeView(ClienteView view);

    public ClienteModel getModel();
    public void setModel(ClienteModel model);

    //Métodos a los que la vista llamará. Por ahora permitimos crear nuevos clientes
    public void nuevoClienteGesture(String dni, String nombre, String direccion);
    public void borraClienteGesture(String dni);
    public void actualizaClienteGesture(String dni, String nombre, String direccion);
    public List<Cliente> listaClientesGesture();
    
    
    //Métodos que el modelo puede llamar
    public void fireDataModelChanged();


}
