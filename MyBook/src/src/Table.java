package src;

public class Table {
    private String table;

    public Table(String table1) {
        table = table1;
    }

    @Override
    public String toString() {
        return "Table: "+ table+"\n";
    }
}
