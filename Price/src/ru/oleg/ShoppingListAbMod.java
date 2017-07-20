package ru.oleg;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class ShoppingListAbMod extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnName(int column){

        switch (column){
            case 0:return "П/Н";
            case 1:return "Список покупок";
            case 2:return "Количество";
            case 3:return "Цена";
        }
        return "";

    }
}