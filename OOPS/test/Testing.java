package OOPS.test;

public class Testing {

    public static void main(String[] args) {

        // Me m1 = new Me();
        // Me m2 = new Me("Yuvraj");

        // Me m1 = new Me("Yuvraj", 10);

        // m1.setAge(10);

        Her m1 = new Her();
        Me me1 = new Me();
        me1.setAge(30);
        m1.setName("Yuvraj");
        m1.setAge(20);
        System.out.println(me1.getAge());

        System.out.println(m1.getAge());
    }
}

class Me {
    String name;
    int age;
    String occ;

    // Me() {

    // }

    // Me(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

}

class Her extends Me {
    String cute;
    int apnaPan;
    int age;

    void sheIsMine() {
        System.out.println("Hii cute");
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}