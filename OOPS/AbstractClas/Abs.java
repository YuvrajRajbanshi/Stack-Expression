package OOPS.AbstractClas;

public class Abs {

    public static void main(String[] args) {

        Kutta k = new Kutta();
        k.move();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("All animals are good");

    }

    abstract void move();
}

class Kutta extends Animal {

    void move() {
        System.out.println("I am running for food");
    }
}