package lab_09_2;

//Horse: Max 75 km/h
//        Tiger: Max 100 Km/h
//        Dog: Max 60 KM/h*
//        Create an Animal class with a method speed() which return a random speeds
//        Create 3 objects for those 3 animal type
//        Run and see which animal is winner for racing
public class Animal {
    private String type;
    private int speed;

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return speed;
    }
}
