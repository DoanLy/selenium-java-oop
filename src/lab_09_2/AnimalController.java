package lab_09_2;

import java.security.SecureRandom;
import java.util.List;

public class AnimalController {
    public static List randomSpeed(List<Animal> animalList) {
        for (Animal animal : animalList) {
            int random = new SecureRandom().nextInt(animal.getMaxSpeed());
            animal.setSpeed(random);
            System.out.println("Speed of " + animal.getType() + " is " + animal.getSpeed());
        }
        return animalList;
    }

    public static String winnerAnimal(List<Animal> animalList) {

        int maxSpeed = 0;
        String maxAnimalType = "";
        for (Animal animal : animalList) {
            if (maxSpeed < animal.getSpeed()) {
                maxSpeed = animal.getSpeed();
                maxAnimalType = animal.getType();
            }
        }
        System.out.println("===> " + maxAnimalType + " is winner.");
        return maxAnimalType;
    }
}
