package lesson3.parameter;

import java.util.ArrayList;
import java.util.Collection;

interface Animal
{
    public String talk();
}

class Cat implements Animal
{
    public String talk()
    {
        return "Cat says Meow!";
    }
}

class Dog implements Animal
{
    public String talk()
    {
        return "Dog says Woof! Woof!";
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Collection<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());

        Cat cat = new Cat();

        for (Animal a : animals)
        {
            System.out.println(a.talk());
        }
    }
}