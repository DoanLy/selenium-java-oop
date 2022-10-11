package lab_09_2;

public class Tiger extends Animal {
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getType() {
        return "Tiger";
    }
}
