package Factory;

public class Main {
    public static void main(String[] args) {
       CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee americano = coffeeFactory.getCoffee(CoffeeType.AMERICANO);
        System.out.println(americano.getClass().getSimpleName());

        Coffee espresso = coffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        System.out.println(espresso.getClass().getSimpleName());
    }
}
