package beverages;

public class Cinnamon extends Supplement {

    public Cinnamon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 0.05;
    }
}
