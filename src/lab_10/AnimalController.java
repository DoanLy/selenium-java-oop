package lab_10;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public List<AnimalWithBuilder> getAnimalRacer(List<AnimalWithBuilder> animalList) {
        List<AnimalWithBuilder> tempAnimal = new ArrayList<>();
        for (AnimalWithBuilder animal : animalList) {
            if (!animal.getisWing()) {
                tempAnimal.add(animal);
            }
        }
        return tempAnimal;
    }

    public AnimalWithBuilder winnerAnimal(List<AnimalWithBuilder> animalList) {
        List<AnimalWithBuilder> racerAnimalList = getAnimalRacer(animalList);
        int maxSpeed = 0;
        AnimalWithBuilder winAnimal = null;
        for (AnimalWithBuilder animal : racerAnimalList) {
            if (maxSpeed < animal.getSpeed()) {
                maxSpeed = animal.getSpeed();
                winAnimal = animal;
            }
        }
        return winAnimal;
    }
}