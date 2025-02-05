package oops;

public class polymorphism {


    // Polymorphism achieve through method overloading
    static void show(int a){
        System.out.println(a);
    }

    static void show(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        polymorphism.show("This is polymorphism");
    }
}
