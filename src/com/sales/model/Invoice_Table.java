
package com.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Invoice_Table extends AbstractTableModel {
    private ArrayList<Invoice_Header> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public Invoice_Table(ArrayList<Invoice_Header> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice_Header invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNum();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}
