package beverages;

public class BeverageCatalog {

    public static Beverage getBeverage(BeverageCatalogItem catalog) {
        switch (catalog){
            case COFFEE:
                return new Coffee();
            case COFFEE_MILK:
                return new Milk(new Coffee());
            case COFFEE_MILK_CREAM:
                return new Milk(new Cream(new Coffee()));
            case HOT_CHOCOLATE:
                return new HotChocolate();
            case HOT_CHOCOLATE_CREAM:
                return new Cream(new HotChocolate());
            case TEA:
                return new Tea();
            case TEA_MILK:
                return new Milk(new Tea());
            default:
                throw new IllegalArgumentException();
        }
    }
}
