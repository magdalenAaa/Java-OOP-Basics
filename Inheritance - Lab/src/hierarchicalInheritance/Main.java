package hierarchicalInheritance;

/**
 * Created by Magdalena on 15.3.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
