package lesson3.extends_examples;

class Dog {
    public void voice() {}
}

class Cat {
    public void voice() {}
}

class Dogocat extends Dog/*, Cat*/ {

}

public class Main {
    static void main(String args) {
        Dogocat dogocat = new Dogocat();
        dogocat.voice(); // что должно вызыватся?
    }
}
