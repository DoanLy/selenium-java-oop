package lab_11;

//Horse: Max 75 km/h
//        Tiger: Max 100 Km/h
//        Dog: Max 60 KM/h*
//        Create an Animal class with a method speed() which return a random speeds
//        Create 3 objects for those 3 animal type
//        Run and see which animal is winner for racing
public abstract class Animal {
    public String name;
    public int speed;

    public abstract String getName();

    public abstract void randomSpeed();

    public abstract void setSpeed(int speed);

    public abstract int getMaxSpeed();
}
