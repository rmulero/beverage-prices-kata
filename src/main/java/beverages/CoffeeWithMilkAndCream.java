package beverages;

public class CoffeeWithMilkAndCream extends Coffee {

    private Milk milk = new Milk();

    @Override
    public double price() {
        return super.price() +  milk.price() + 0.15;
    }
}
