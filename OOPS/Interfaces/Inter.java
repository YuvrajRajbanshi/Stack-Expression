package OOPS.Interfaces;

public class Inter {

    public static void main(String[] args) {

        Queen q = new Queen();
        q.move();
    }

}

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {

    public void move() {
        System.out.println("UP, DOWN, LEFT, RIGHT, DIGONALLY");
    }
}

class Pawn implements ChessPlayer {
    public void move() {
        System.out.println("LEFT and RIGHT FORWARD as WELL LEFT and RIGHT Digonally to kill");
    }
}
