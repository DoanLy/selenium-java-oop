package lab_09_2;

public class Dog extends Animal {
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public int getMaxSpeed() {
        return 60;
    }
}
