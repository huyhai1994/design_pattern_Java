package chapter1.trategy;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("overriden to Squeak");
    }


    @Override
    public void display() {
        System.out.println("looks like a rubberduck");
    }

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
    }
}
