import java.util.Scanner;

public class CandyMachineMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CandyMachine machine = new CandyMachine(new String[] {"Twix", "Chips", "Kit-Kat", "Gum", "Popcorn"}, new double[]{0.65, 0.50, 0.75, 0.75, 0.65, 0.55});

        //String[] candyList = {"Twix", "Chips", "Nutter Butter", "Peanut Butter Cup", "Juicy Fruit Gum"};

        System.out.println("Welcome to Manny's Candy Emporium!\n");
        System.out.println("How much money do you have?");

        double money = scan.nextDouble();

        System.out.println("Here's what we got:\n\n");
        machine.printStock();

        String choice = scan.next();

        if (machine.checkChoice(choice))
            System.out.println(machine.dispense(choice, money));

        else
            System.out.println("Don't got that");


    }
}