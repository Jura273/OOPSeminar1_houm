package OOPSeminar1;



public class HotCoffee extends Product{
    private int temperature;
    //private double price;
    private double volume;
    public HotCoffee(String name,double price, double volume, int temperature){
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
        // checkTemperature(temperature);
        // checkPrice(price);

    }
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotCoffee{" +
                "name = " + super.getName() +
                ";volume = " + volume +
                ";cost = " + super.getCost() +
                ";temperature = " + temperature +
                '}';
    }


}