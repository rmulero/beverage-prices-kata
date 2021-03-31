package beverages;

public class CoffeeWithMilk extends Coffee {

    private Milk milk = new Milk();

    @Override
    public double price() {
        return super.price() + milk.price();
    }
}
