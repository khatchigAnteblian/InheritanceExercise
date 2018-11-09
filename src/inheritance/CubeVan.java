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
public class CubeVan extends Vehicle {
    private double capacity;
    private double maxCapacity;
    
    public CubeVan(double maxCap) {
        this.maxCapacity = maxCap;
    }
    
    public CubeVan(String manu, String model, short year, String col, byte nDoors, float tankSize, double maxCap) {
        super(manu, model, year, col, nDoors, tankSize);
        this.maxCapacity = maxCap;
    }
    
    public boolean fillCubeVan(double fill) {
        // Fill tank so that it doesn't exceed max capacity
        if ((this.maxCapacity - fill) >= this.capacity) {
            this.capacity += fill;
            return true;
        }
        return false;
    }
    
    public void emptyCubeVan() {
        this.capacity = 0;
    }
    
    public double currentCapacity() {
        return this.capacity;
    }
}
