package lab_10;

import lab_10.AnimalWithBuilder.Builder;

import java.util.Arrays;
import java.util.List;

public class AnimalsTest {
    public static void main(String[] args) {
        AnimalWithBuilder dog = new Builder().setName("dog").setWing(false).randomSpeed().build();
        AnimalWithBuilder chicken = new Builder().setName("chicken").setWing(true).randomSpeed().build();
        AnimalWithBuilder pig = new Builder().setName("pig").setWing(false).randomSpeed().build();
        AnimalWithBuilder bird = new Builder().setName("bird").setWing(true).randomSpeed().build();
        AnimalWithBuilder tiger = new Builder().setName("tiger").setWing(false).randomSpeed().build();

        List<AnimalWithBuilder> animalList = Arrays.asList(dog, chicken, pig, bird, tiger);
        for (AnimalWithBuilder animal : animalList) {
            System.out.println(animal);
        }
        AnimalController controller = new AnimalController();
        System.out.println("Winner: " + controller.winnerAnimal(animalList).getName());


    }

}
