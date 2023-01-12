public class Car {
    /*
    From this overarching theme of cars,
    you can create objects that are the types of cars
    (lambo, ferrari)
    These classes also have specific variables that are initialised in the constructor
    to allow the rest of the objects to have it when they are declared/initialised
    */
    /* Class Variables */
    private int speed;
    private String brand;

    /* Default Constructor */
    public Car (int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    /* Methods */
    public void setSpeed (int speed) {
        this.speed = speed;
    }
    // Get methods to retrieve private data members
    public int getSpeed () {
        return this.speed;
    }
    public static void main (String[] args) {
        // Declaring and initialising an object
        // Passing paramters that correspond to this object into the constructor
        Car lambo = new Car(20, "Dirt");
        Car ferrari = new Car(30, "Ferrari");
        System.out.println("The lambo is travelling at: " + lambo.speed + " km/h");
        System.out.println("The ferrari is travelling at: " + ferrari.speed + " km/h.");
        lambo.setSpeed(50);
        System.out.println(lambo.speed);
        System.out.println(ferrari.speed);
        System.out.println("This is a test.");
        System.out.println("Does this work, yes or no?");
    }


}