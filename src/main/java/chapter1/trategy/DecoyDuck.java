package chapter1.trategy;

public class DecoyDuck extends Duck {


    @Override
    public void display() {
        System.out.println("look like a decoy duck");
    }


    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
    }
}
