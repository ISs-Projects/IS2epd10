package vista.cliente;

import controlador.ClienteController;



/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface ClienteView {
   
    public ClienteController getController();
    public void setController(ClienteController cc);
    
    public void dataModelChanged();
    public void display();
}
