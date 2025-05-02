package OOPS.GetterSetter;

public class GetterSetter {

    public static void main(String[] args) {

        Pen p = new Pen();
        p.setColor("Blue");
        System.out.println(p.getColor());

        p.setThick(10);
        System.out.println(p.getThick());

    }

}

class Pen {

    private String color;
    private int thick;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setThick(int thick) {
        this.thick = thick;
    }

    int getThick() {
        return this.thick;
    }
}
