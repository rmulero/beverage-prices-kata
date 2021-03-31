package beverages;

public class Milk extends Supplement {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 0.10;
    }
}
