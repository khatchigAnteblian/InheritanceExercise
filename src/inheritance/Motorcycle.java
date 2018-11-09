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
public class Motorcycle extends Vehicle {
    private double engineSize;
    
    public Motorcycle(double engSize) {
        this.engineSize = engSize;
    }
    
    public Motorcycle(String manu, String model, short year, String col, byte nDoors, float tankSize, double engSize) {
        super(manu, model, year, col, nDoors, tankSize);
        this.engineSize = engSize;
    }
    
    public double getEngineSize() {
        return this.engineSize;
    }
}
