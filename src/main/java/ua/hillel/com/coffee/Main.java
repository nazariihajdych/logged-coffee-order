package ua.hillel.com.coffee;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();


        coffeeOrderBoard.add("Cappuccino", "Назар");
        coffeeOrderBoard.add("Frappuccino", "Аліна");
        coffeeOrderBoard.add("Espresso", "Віталік");

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver();


        coffeeOrderBoard.add("Ice Latte", "Олег");
        coffeeOrderBoard.add("Americano", "Назар");
        coffeeOrderBoard.add("Espresso", "Орист");
        coffeeOrderBoard.add("Espresso", "Аліна");

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(2);
        coffeeOrderBoard.deliver(5);
        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.deliver(4);
        coffeeOrderBoard.deliver(6);
        coffeeOrderBoard.deliver(7);

        coffeeOrderBoard.draw();

        coffeeOrderBoard.add("Americano", "Назар");
        coffeeOrderBoard.add("Espresso", "Орист");
        coffeeOrderBoard.add("Frappuccino", "Аліна");
        coffeeOrderBoard.add("Espresso", "Віталік");
        coffeeOrderBoard.add("Cappuccino", "Назар");

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.deliver(5);
        coffeeOrderBoard.deliver();

        coffeeOrderBoard.draw();



    }
}
