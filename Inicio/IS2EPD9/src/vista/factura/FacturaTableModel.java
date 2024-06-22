package vista.factura;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import modelo.entidades.Factura;

/**
 *
 * @author Norberto Díaz-Díaz
 */
public class FacturaTableModel implements TableModel, ComboBoxModel{

    private List<Factura> facturas = new ArrayList<Factura>();
    private List<TableModelListener> tableListeners = new ArrayList<TableModelListener>();
    private List<ListDataListener> dataListeners = new ArrayList<ListDataListener>();
    
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
        fireContentsChanged();
    }

    protected void fireContentsChanged() {
        fireContentsChangedTableModel();
        fireContentsChangedListData();
    }
    //--------------- MÉTODOS PROPIOS DE TableModel -------------------------

    public Factura getRow(int indexRow) {
        return facturas.get(indexRow);
    }

    public int getRowCount() {
        return facturas.size();
    }

    public int getColumnCount() {
        return 3; //ya que tendremos tres valores a mostrar por cliente
    }

    public String getColumnName(int columnIndex) {
        String name = null;
        switch (columnIndex) {
            case 0:
                name = "Identificador";
                break;
            case 1:
                name = "Cliente";
                break;
            case 2:
                name = "Importe";
                break;
        }
        return name;
    }

    public Class<?> getColumnClass(int columnIndex) {
        Class c = null;
        switch (columnIndex) {
            case 0:
                c=String.class;
                break;
            case 1:
                c = String.class;//pondré sólo el nombre del cliente
                break;
            case 2:
                 c= Double.class;
                break;
        }
        return c;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //No permito editar celdas
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Factura factura = facturas.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = factura.getIdentificador();
                break;
            case 1:
                value = factura.getCliente().getDNI();
                break;
            case 2:
                value = factura.getImporte();
                break;
        }
        return value;

    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addTableModelListener(TableModelListener l) {
        tableListeners.add(l);
    }

    public void removeTableModelListener(TableModelListener l) {
        tableListeners.remove(l);
    }

    protected void fireContentsChangedTableModel() {
        
        TableModelEvent event = new TableModelEvent(this, 0, this.getRowCount() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        for (TableModelListener listener : tableListeners) {
            listener.tableChanged(event);
        }
    }
    
    protected void fireContentsChangedListData() {
    ListDataEvent e = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, facturas.size());
    for (ListDataListener l : dataListeners) {
        l.contentsChanged(e);
    }
}
     public void addListDataListener(ListDataListener l) {
        dataListeners.add(l);
    }

    public void removeListDataListener(ListDataListener l) {
        dataListeners.remove(l);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
