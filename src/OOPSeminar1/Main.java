package OOPSeminar1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);

        HotCoffee b6 = new HotCoffee("arab",2,1,40);
        HotCoffee b7 = new HotCoffee("oro",3,1,41);
        HotCoffee b8 = new HotCoffee("brasil",4,2,42);
        HotCoffee b9 = new HotCoffee("mokko",5,3,38);

        HotCoffeeVendingMachine vendingMachine1 = new HotCoffeeVendingMachine(new ArrayList<>());
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());

        vendingMachine1.addHotCoffee(b6);
        vendingMachine1.addHotCoffee(b7);
        vendingMachine1.addHotCoffee(b8);
        vendingMachine1.addHotCoffee(b9);

        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));

        System.out.println(vendingMachine1.getProduct("arab"));
        System.out.println(vendingMachine1.getProduct("oro", 1));
        System.out.println(vendingMachine1.getProduct("brasil",2));
        System.out.println(vendingMachine1.getProduct("mokko"));

    }

}
