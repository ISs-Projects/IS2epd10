package vista.factura;

import controlador.FacturaController;



/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface FacturaView {
    
    
    public FacturaController getController();
    public void setController(FacturaController fc);
    
    public void dataModelChanged();
    public void display();
}
