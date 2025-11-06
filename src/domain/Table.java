package domain;

public class Table {
    private int tableNumber;
    
    public Table(int tableNumber){
        this.tableNumber = tableNumber;
    }

    public void setId(int tableNumber){
        if (tableNumber > 0){
            this.tableNumber = tableNumber;
        }else{
            this.tableNumber = 1;
        }
    }
    
    public int getId(){
        return tableNumber;
    }
}
