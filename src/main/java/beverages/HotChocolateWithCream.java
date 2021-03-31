package beverages;

public class HotChocolateWithCream extends HotChocolate {

    private Cream cream = new Cream();

    @Override
    public double price() {
        return 1.45 + cream.price();
    }
}
