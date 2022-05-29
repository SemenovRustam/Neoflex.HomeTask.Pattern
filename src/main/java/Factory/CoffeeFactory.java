package Factory;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default: throw new RuntimeException("Wrong coffee");
        }
        return coffee;

    }
}
