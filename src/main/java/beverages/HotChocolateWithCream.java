package beverages;

public class HotChocolateWithCream extends HotChocolate {

    private Cream cream = new Cream();

    @Override
    public double price() {
        return super.price() + cream.price();
    }
}
