package rekkei;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car("Mazda 3", "BMW 4");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "BMW 7");
        System.out.println(Car.numberOfCars);
    }

}