package chapter1.trategy;

public class RedheadDuck extends Duck {
    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
    }

    @Override
    public void display() {
        System.out.println("Looks like a redhead!!!");
    }
}
