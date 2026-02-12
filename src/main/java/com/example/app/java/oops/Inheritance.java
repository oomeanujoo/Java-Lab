package com.example.app.java.oops;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x");
        this.x = x;
    }

    public void baseClass() {
        System.out.print("I am a Constructor!");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        b.setX(786);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(999);
        System.out.println(d.getX());
    }
}
