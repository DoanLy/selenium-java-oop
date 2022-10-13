package lab_10;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private final boolean isWing;
    private final String name;
    private final int speed;

    public boolean getisWing() {
        return isWing;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    private AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.isWing = builder.isWing;
        this.speed = builder.speed;
    }

    public static class Builder {
        private boolean isWing;
        private String name;
        private int speed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWing(boolean wing) {
            isWing = wing;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder randomSpeed() {
            int random = new SecureRandom().nextInt(100);
            this.speed = random;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }


    }


    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "isWing=" + isWing +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
