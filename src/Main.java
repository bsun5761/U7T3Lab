import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car one =  new Car("Jeep", 12000);
        Car two = new Car ("Ford", 1000);
        Car three =  new Car("Honda", 1950);

        Car[] cars = {one, two, three};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
        System.out.println("Hi");
    }
}