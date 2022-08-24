
package com.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Line_Table extends AbstractTableModel {

    private ArrayList<Line_Header> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public Line_Table(ArrayList<Line_Header> lines) {
        this.lines = lines;
    }

    public ArrayList<Line_Header> getLines() {
        return lines;
    }
    
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Line_Header line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getNum();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}
