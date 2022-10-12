package lesson3.type;

public class Main {
    public static void main(String[] args) {
        action(new Cat());
        action(new Dog());
        action(new Cow());
    }

    public static void action(Animal animal) {
        animal.voice();
    }
}

class Animal {
    public void voice() {
        System.out.println("");
    }
}

class Cat extends Animal {
    public void voice() {
        System.out.println("lesson3.type.Cat");
    }
}

class Dog extends Animal {
    public void voice() {
        System.out.println("lesson3.type.Dog");
    }
}

class Cow extends Animal {
    public void voice() {
        System.out.println("lesson3.type.Cow");
    }
}
