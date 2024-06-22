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
public abstract class AbstractViewImpl <C extends Controller> extends javax.swing.JPanel
        implements View<C>{

    private C controller;
    
    public C getController() {
        return controller;
    }

    public void setController(C controller) {
        this.controller=controller;
    }

    public void dataModelChanged() {
        refresh();
    }

    protected abstract void refresh();

    public void display(){
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                setVisible(true);
                refresh();
            }
        });

    }

}
