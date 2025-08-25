package chapter1.trategy;

public class MallardDuck extends Duck {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
    }

    @Override
    public void display() {
        System.out.println("look like a mallard!!!");
    }
}
