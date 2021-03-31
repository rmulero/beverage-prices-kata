package beverages;

public class TeaWithMilk extends Tea {

    private Milk milk = new Milk();

    @Override
    public double price() {
        return super.price() +  milk.price();
    }
}
