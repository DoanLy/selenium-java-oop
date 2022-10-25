package lab_11;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public void randomSpeed() {
        this.setSpeed(new SecureRandom().nextInt(this.getMaxSpeed()));
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }
}
