package lab_11;

import java.util.List;

public class AnimalController {
    public static List randomSpeed(List<Animal> animalList) {
        for (Animal animal : animalList) {
//            int random = new SecureRandom().nextInt(animal.getMaxSpeed());
//            animal.setSpeed(random);
            animal.randomSpeed();
            System.out.println("Speed of " + animal.getName() + " is " + animal.speed);
        }
        return animalList;
    }

    public static String winnerAnimal(List<Animal> animalList) {

        int maxSpeed = 0;
        String maxAnimalType = "";
        for (Animal animal : animalList) {
            if (maxSpeed < animal.speed) {
                maxSpeed = animal.speed;
                maxAnimalType = animal.getName();
            }
        }
        System.out.println("===> " + maxAnimalType + " is winner.");
        return maxAnimalType;
    }
}
