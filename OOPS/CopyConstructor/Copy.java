package OOPS.CopyConstructor;

public class Copy {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 21);
        Student s2 = new Student(s1); // using copy constructor

        s1.display(); // Alice 21
        s2.display(); // Alice 21
    }

}

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}
