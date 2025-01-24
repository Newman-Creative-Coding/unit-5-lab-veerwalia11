public class CarTester {
    public static void main (String args[]) {
        Car one = new Car ("Roadster");
        System.out.println(one.getVIN());
        System.out.println(one.getModel());
        System.out.println(one.getMake());
        one.setPlateNumber("WGY085");
        System.out.println(one.getTotalProfits());
        System.out.println(one.getTotalCars());
        System.out.println(one.getTotalRoadsters());
        System.out.println(one.getTotalCubesters());
        System.out.println(one.getTotalSpeedsters());
    }
}
