package lab_12;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public List<FlyAble> eligibleRacer(List<FlyAble> flyAbleList) {
        List<FlyAble> eligibleRacer = new ArrayList<>();
        for (FlyAble animal : flyAbleList) {
            if (!animal.flyAble()) {
                eligibleRacer.add(animal);
            }
        }
        return eligibleRacer;
    }

    public MoveAble getWinner(List<MoveAble> animals) {
        MoveAble winner = animals.get(0);
        for (MoveAble animal : animals) {
            if (animal.speed() > winner.speed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
