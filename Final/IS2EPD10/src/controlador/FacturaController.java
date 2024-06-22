/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.io.Serializable;
import java.util.List;
import modelo.FacturaModel;
import modelo.entidades.Factura;
import vista.factura.FacturaView;


/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface FacturaController extends Controller<FacturaModel, FacturaView, Serializable>{
    
    public List<Factura> listaFacturaEntidadGesture();
    public List<Factura> listarFacuraEntidadPorClienteGesture(String nombre);

}
