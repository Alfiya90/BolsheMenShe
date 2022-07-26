package Lesson33;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Animal> animals =  new ArrayList <>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        animals.add(new Animal(3));
        test(animals);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add( new Dog());
        test(dogs);
    }



    public  static void test (List<? extends Animal> list){
        for(Animal animal: list) {
            animal.eat();
        }
    }
}
