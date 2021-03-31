package unit_tests;

import beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = BeverageCatalog.getBeverage(BeverageCatalogItem.COFFEE);
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = BeverageCatalog.getBeverage(BeverageCatalogItem.TEA);
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = BeverageCatalog.getBeverage(BeverageCatalogItem.HOT_CHOCOLATE);
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = BeverageCatalog.getBeverage(BeverageCatalogItem.TEA_MILK);
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = BeverageCatalog.getBeverage(BeverageCatalogItem.COFFEE_MILK);
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage coffeeWithMilkAndCream = BeverageCatalog.getBeverage(BeverageCatalogItem.COFFEE_MILK_CREAM);
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = BeverageCatalog.getBeverage(BeverageCatalogItem.HOT_CHOCOLATE_CREAM);
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }
}
