package chapter1.trategy;

public class DecoyDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("to do nothing");
    }

    @Override
    public void display() {
        System.out.println("look like a decoy duck");
    }

    @Override
    public void fly() {
        System.out.println("to do nothing");
    }

    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.fly();
        decoyDuck.quack();
        decoyDuck.swim();
    }
}
