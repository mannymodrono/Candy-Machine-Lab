public class CandyMachine {
    private String[] stock;
    private double[] prices;


    public CandyMachine (String[] pStock, double[] pPrices) {
        this.stock = pStock;
        this.prices = pPrices;
    }

    public void printStock () {
        for (int i = 0; i < stock.length; i++){
            System.out.println(stock[i] + "\t\t$" + prices[i]);
        }
    }

    public void dispense(String choice, double money){
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].equals(choice) && prices[i] <= money){
                System.out.print("Great choice!\nYour change is: ");
                System.out.println(money - prices[i]);
            }
        }
    }
}
