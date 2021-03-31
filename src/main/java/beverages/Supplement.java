package beverages;

public abstract class Supplement implements Beverage {

    protected Beverage beverage;

    public Supplement(Beverage beverage) {
        this.beverage = beverage;
    }
}
