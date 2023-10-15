package OOPSeminar1;
import OOPSeminar1.HotCoffee;
import OOPSeminar1.Product;
import OOPSeminar1.VendingMachine;

import java.util.List;

public class HotCoffeeVendingMachine implements VendingMachine {
    List<HotCoffee> hotcoffee;

    public HotCoffeeVendingMachine(List<HotCoffee> products) {
        this.hotcoffee = products;
    }

    public List<HotCoffee> getHotcoffee() {
        return hotcoffee;
    }

    public void setHotcoffee(List<HotCoffee> hotcoffee) {
        this.hotcoffee = hotcoffee;
    }

//    public List<BottleOfWatter> getBottleOfWatters() {
//        return bottleOfWatters;
//    }
//
//    public void setBottleOfWatters(List<BottleOfWatter> bottleOfWatters) {
//        this.bottleOfWatters = bottleOfWatters;
//    }

    @Override
    public Product getProduct(String name) {
        for (HotCoffee item : hotcoffee) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for (HotCoffee hotcoffee : hotcoffee) {
            if(hotcoffee.getName().equals(name) && hotcoffee.getVolume() == volume)
                return hotcoffee;
        }
        return null;
    }
    public void addHotCoffee(HotCoffee hotCoffee){
        this.hotcoffee.add(hotCoffee);
    }
}
