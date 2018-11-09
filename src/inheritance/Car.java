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
public class Car extends Vehicle {

    private int maxPassengers;
    private int numPassengers;
    
    public Car(int maxPass) {
        this.maxPassengers = maxPass;
    }

    public Car(String manu, String model, short year, String col, byte nDoors, float tankSize, int maxPass) {
        super(manu, model, year, col, nDoors, tankSize);
        this.maxPassengers = maxPass;
    }
    
    public boolean addNumPassenger(int num) {
        // Add passengers if it doesn't exceed max capacity
        if ((this.maxPassengers - num) >= numPassengers) {
            this.numPassengers += num;
            return true;
        }
        return false;
    }
    
    public void removePassengers(int num) {
        // Remove passengers as long as it doesn't go below zero
        if (num <= this.numPassengers) {
            this.numPassengers -= num;
        } else {
            this.numPassengers = 0;
        }
    }
    
    public int getPassengers() {
        return this.numPassengers;
    }
    
}
