public class Animal {
    int age;
    double weight;
    String name;

    {
        age = 0;
    }

    Animal (double weight){ // Любое животное имеет вес
        this.weight = weight;
    }

    Animal (double weight, String name){ // Домашнее животное имеет и вес и имя
        this.weight = weight;
        this.name = name;
    }
}
