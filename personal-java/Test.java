public class Test {
    
    private int test;

    public Test (int test) {
        this.test = test;
    }

    public int getTest () {
        return this.test;
    }

    public void setTest (int k) {
        this.test = k;
    }

    public static void main (String[] args) {
        // Test test = new Test(1);
        // System.out.println(test.getTest());
        // test.setTest(2);
        // System.out.println(test.getTest());


        Circle c1 = new Circle(1,2,3); // object 1
        Circle c2 = new Circle(2,4,6); // object 2

        // System.out.println(c1.radius);
    }
}
