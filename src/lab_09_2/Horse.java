package lab_09_2;

public class Horse extends Animal {
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public int getMaxSpeed() {
        return 75;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
