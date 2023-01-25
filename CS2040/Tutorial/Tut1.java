package CS2040.Tutorial;


public class Tut1 {
    public void answers () {
        final Object[][] table = new String[3][];
        table[0] = new String[] {"Class", "Object"};
        table[1] = new String[] {"A class (template for objects) describes the properties of an object as well the `actions` of the object in the form of methods", "An object is just an instance of that class"};

        System.out.println("1a.");
        for (final Object[] row : table) {
            System.out.format("%15s%15s%15s%n", row);
        }

        System.out.println("1b. ");
        System.out.println("So that the compiler can call the main method without the creation of/presence of an existing object. " );
        System.out.println("Static variables/methods are tied to class/main method is an entry point of the program" );

        System.out.println("1c. ");
        System.out.println("Inheritance superclass");
        System.out.println("Private Constructor (use factory method to call the private constructor within that class, %nfrom outside the class, can only call this factory method.");
        System.out.println("private class Animal {} ");
        System.out.println("Private class vaiables");

        System.out.println("1d.(i) ");
        System.out.println("- It helps to improve abstraction by storing the method signatures.");
        System.out.println("- It also helps define exactly what behaviour a class that implements the interface must have");
        
        System.out.println("Seen as a contract that is signed by the class when implementing.");
        System.out.println("Can be used as types");
        System.out.println("Guaranteed that classes which implement a particular interface, support the operations specified by the interface");
        System.out.println("Returning an interface -> ensures that users can only edit the attributes specified in the interface.");

        
        System.out.println("1d.(iii) ");
        System.out.println("Yes");


        System.out.println("1e. ");
        System.out.println("Predicted Output: (same for j, k)");
        System.out.println("I am in addOne. The value of i is 8");
        System.out.println("The final value of i back in main is 7");
        System.out.println("First line of output is from the I/O in each of the static methods, however, the scope of the values are limited to only those values, and the values in the main method are localised to that scope alone. Hence they are still unaffected by the increments.");
        System.out.println("Two types of variables in Java, primitive (lowercase types) and reference types.");
        System.out.println("Passing primitive types, value is passed. Passing reference types, a pointer to the object is passed");
        
        System.out.println("1f. ");
        System.out.println("Yes. It is resolved by using the this keyword when referring to the member variable in the class.");
        System.out.println("Eg. this.reason = reason; ");

        System.out.println("================");
        System.out.println("2a. ");
        System.out.println("O(n ^ 3) (take dominant term)");
        System.out.println("2b. ");
        System.out.println("O(n ^ 2 (log n)");
        System.out.println("2c. ");
        System.out.println("O(n ^ 5)");
        System.out.println("2d. ");
        System.out.println("O(2 ^ (2 n ^ 2 + 4n))");

        System.out.println("================");
        System.out.println("3a.");
        System.out.println("O(n)");
        System.out.println("3b.");
        System.out.println("O(n log n)");
        System.out.println("3c.");
        System.out.println("More dominant term is O(n), it grows faster than log n");

        
        System.out.println("================");
        System.out.println("4.");
        System.out.println("For loop, then check if the next element has a difference of 1 from the previous. If not, then it is the missing element. eg. 1,2,3,5,..... 10");
        System.out.println("Efficient Approach using divide and conquer");
        System.out.println("");

        System.out.println("5.");
        System.out.println("Refer to lecture 3 for more examples.");

        System.out.println("6.");
        System.out.println("Turning points of the x/y coordinates (i.e. when the coordinates change direction increasing/decreasing) are the largest values");
        
    }

    public int search4 (int[] arr, int size) {
        // pointers
        // Elements behind missing element will be arr[index] - index = 1
        // Elements after missing element will be arr[index] - index = 2;
        int a = 0, b = size - 1;
        int mid = 0;
        while ((b - a) > 1) {
            mid = (a + b) / 2;
            if ((arr[a] - a) != (arr[mid] - mid))
                b = mid;
            else if ((arr[b] - b) != (arr[mid] - mid))
                a = mid;
        }
        return (arr[a] + 1);
    }
}