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
public class Vehicle {
    private String manufacturer;
    private String model;
    private short year;
    private String colour;
    private byte numOfDoors;
    private float gasTankSize;
    private float gas = 0;
    private int km = 0;
    
    public Vehicle(){}
    
    public Vehicle(String manu, String model, short year, String col, byte nDoors, float tankSize) {
        this.manufacturer = manu;
        this.model = model;
        this.year = year;
        this.colour = col;
        this.numOfDoors = nDoors;
        this.gasTankSize = tankSize;
    }
    
    public void paint(String col) {
        // Change the colour of the vehicle
        this.colour = col;
    }
    
    public void gasUp(int litres) {
        // Fill the gas tank by given litres
        this.gas += litres;
    }
    
    public boolean drive(int distance) {
        // Check if there's enough gas left
        // If so, add distance driven to total km
        // Decrease gas by appropriate amount
        if (this.gas >= distance * 0.2) {
            this.gas -= distance * 0.2;
            this.km += distance;
            return true;
        }
        return false;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @return the numOfDoors
     */
    public byte getNumOfDoors() {
        return numOfDoors;
    }

    /**
     * @return the gasTankSize
     */
    public float getGasTankSize() {
        return gasTankSize;
    }

    /**
     * @return the gas
     */
    public float getGas() {
        return gas;
    }

    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }
}
