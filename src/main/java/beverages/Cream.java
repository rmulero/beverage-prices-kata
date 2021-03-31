package beverages;

public class Cream extends Supplement {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 0.15;
    }
}
