/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author 345983704
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle("Audi", "A3", (short) 2010, "Yellow", (byte) 4, 40.0f);
        v.paint("green");
        System.out.println(v.getColour());
        v.gasUp(32);
        v.drive(100);
        System.out.println(v.getGas());
        
        Car car = new Car("Ford", "Mustang", (short) 2017, "Pink", (byte) 4, 43.5f, 4);
        System.out.println(car.getPassengers());
        car.addNumPassenger(3);
        System.out.println(car.getPassengers());
        car.removePassengers(1);
        System.out.println(car.getPassengers());
        
        CubeVan cube = new CubeVan(50.0f);
        cube.fillCubeVan(25f);
        System.out.println(cube.currentCapacity());
        cube.emptyCubeVan();
        System.out.println(cube.currentCapacity());
        
        Motorcycle m = new Motorcycle(2.2);
        System.out.println(m.getEngineSize());
    }
    
}
