/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import controlador.Controller;
import modelo.Model;


/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface View <C extends Controller>{
    C getController();
    void setController(C controller);

    void dataModelChanged();
    void display();

}
