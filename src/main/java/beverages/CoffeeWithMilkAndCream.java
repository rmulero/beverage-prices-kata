package beverages;

public class CoffeeWithMilkAndCream extends Coffee {

    private Milk milk = new Milk();
    private Cream cream = new Cream();

    @Override
    public double price() {
        return super.price() +  milk.price() + cream.price();
    }
}
