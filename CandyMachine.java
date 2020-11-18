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

    public boolean checkChoice(String choice){
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].equalsIgnoreCase(choice)){
                return true;
            }
        }
        return false;
    }

    public String dispense(String choice, double money){
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].equals(choice) && prices[i] <= money){
                money -= prices[i];
                return "Great choice! Your change is: $" + money;
            }
        }
        return "Go home, you can't afford that.";
    }
}
