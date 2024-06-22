package controlador;

import java.util.List;
import modelo.FacturaModel;
import modelo.entidades.Cliente;
import modelo.entidades.Factura;
import vista.factura.FacturaView;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface FacturaController {
    //Metodo para enlazar la vista y el modelo
    public void setup(FacturaModel model, List<FacturaView> view);
    //Metodo para lanzar la aplicación MVC
    public void start();

    public void addView(FacturaView view);
    public void removeView(FacturaView view);

    public FacturaModel getModel();
    public void setModel(FacturaModel model);

    //Métodos a los que la vista llamará. Por ahora permitimos crear nuevos clientes
    public void nuevaFacturaGesture(String id, Cliente cliente, String importe);
    public void borraFacturaGesture(String id);
    public void actualizaFacturaGesture(String id, Cliente cliente, String importe);
    public List<Factura> listaFacturasGesture();
    public List<Factura> listaFacturasPorClienteGesture(String id);
    
    //Métodos que el modelo puede llamar
    public void fireDataModelChanged();

    
}
