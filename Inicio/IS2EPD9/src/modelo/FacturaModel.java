package modelo;

import controlador.FacturaController;
import java.util.List;
import modelo.entidades.Factura;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface FacturaModel {
    //Enlaces con el controlador
    public FacturaController getController();
    public void setController(FacturaController controller);

    //Funciones que debe permitir el modelo
    public void nuevaFactura(Factura factura);
    public Factura obtenerFactura(String nombre);
    public void eliminarFactura(Factura factura);
    public void actualizarFactura(Factura factura);
    public List<Factura> obtenerFacturas();  
    public List<Factura> listarPorCliente(String nombre);    
}
