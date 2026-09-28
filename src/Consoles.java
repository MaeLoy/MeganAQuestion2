public class Consoles implements IConsoles{
    String ConsoleType;
    String Store;
    int TotalSales;
// declaration
    public Consoles (String ConsoleType, String Store, int TotalSales){
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales;
    }
// get methods
    public String getConsoleType() {
        return ConsoleType;
    }

    public String getStore() {
        return Store;
    }

    public int getTotalSales() {
        return TotalSales;
    }
}
