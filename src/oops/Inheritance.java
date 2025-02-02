package oops;

public class Inheritance {

    public static class Animal{
         static void eat(){
            System.out.println("It can eat");
        }
    }
    public static class Dog extends Animal{
         static void run(){
            System.out.println("It can run");
        }
    }
    public static void main(String[] args) {
        Dog desiDog = new Dog();
        desiDog.eat();
    }
}
