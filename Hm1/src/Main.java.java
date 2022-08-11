public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.speed= 120;

        cars.brandName="Hennessey Venom GT";
        cars.printInfo();
        cars.checkSpeed();
        System.out.println(" ");

        Cars cars1 = new Cars();
        cars1.printInfo();
        cars1.checkSpeed();
        System.out.println(" ");

        Cars cars2 = new Cars("taiota",120);
        cars2.printInfo();
        cars2.checkSpeed();
    }
}