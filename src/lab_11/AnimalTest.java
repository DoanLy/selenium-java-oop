package lab_11;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal A = new Horse();
        Animal B = new Tiger();
        Animal C = new Dog();
        List<Animal> animalList = Arrays.asList(A, B, C);
        List<Animal> setRandom = AnimalController.randomSpeed(animalList);
        AnimalController.winnerAnimal(animalList);
    }
}
