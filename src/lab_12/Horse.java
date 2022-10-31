package lab_12;

public class Horse implements MoveAble, FlyAble {

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int speed() {
        return 70;
    }

    @Override
    public String toString() {
        return flyAble() + "," + speed();
    }
}
