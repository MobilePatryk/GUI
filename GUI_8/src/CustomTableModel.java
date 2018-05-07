import javax.swing.table.AbstractTableModel;

public class CustomTableModel extends AbstractTableModel {
    int row,column = 0;


    public CustomTableModel(int r, int c){
        row = r;
        column = c;
    }

    public void setRow(int r){
        row = r;
        fireTableStructureChanged();
    }

    public void setColumn(int c){
        column = c;
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return row;
    }

    @Override
    public int getColumnCount() {
        return column;
    }

    @Override
    public Object getValueAt(int x, int y) {
        return (x+1)*(y+1);
    }
}
