public class Circle {
    
    private double radius;  
    private int x;
    private int y;
    public int[] seed;

    public Circle (int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius () {
        return this.radius;
    }

    public void setRadius (int radius) {
        this.radius = radius;
    }

    public void breakBowl () {
        this.radius = this.radius / 2;
    }

    public double getDiameter() {
        return this.radius * 2;
    }
    public static void main (String[] args) {

        Circle c1 = new Circle(1,2,3); // object 1
        Circle c2 = new Circle(2,4,6); // object 2

        // System.out.println(c1.getRadius());
        Circle bowl = new Circle(3, 2, 1);
        System.out.println(bowl.getRadius());
        bowl.breakBowl();
        System.out.println(bowl.getRadius());
        double area = bowl.getRadius() * bowl.getRadius();
        System.out.println(area);

        
    }
}
