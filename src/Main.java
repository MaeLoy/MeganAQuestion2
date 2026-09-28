//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
//Declaration of variables
    int choice1 = 1;
    int choice2 = 2;
    int choice3 = 3;


    System.out.println(" Select the beverage type");
    System.out.println("1) PS5        2)xbox        3) SWITCH");// Where the user is prompted to make a choice
    int choice = scanner.nextInt();
    System.out.println("Enter the Store");
    String Store = scanner.nextLine();
    System.out.println();

    if (choice1 == 1) {

        System.out.println("Enter the total sales of " + choice1+ "consoles for " + Store + "Electronics Store");
        int TotalSales = scanner.nextInt();
    }
    if (choice1 == 2) {

        System.out.println("Enter the total sales of " + choice2+ "consoles for " + Store + "Electronics Store");
        int  TotalSales = scanner.nextInt();
    }
    if (choice1 == 3) {

        System.out.println("Enter the total sales of " + choice3+ "consoles for " + Store + "Electronics Store");
        int TotalSales = scanner.nextInt();
    }

    ConsoleSales Sales = new ConsoleSales(String ConsoleType, String Store,int TotalSales){
        Sales.printReport(); // callig the console sales class

    }
}
