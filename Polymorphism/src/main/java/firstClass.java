/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UBH Laptops
 */
public class firstClass extends Seat{
    int numberOfSeats;
    int pricePerseat;

    public firstClass(int numberOfSeats, int pricePerseat) {
        this.numberOfSeats = numberOfSeats;
        this.pricePerseat = pricePerseat;
    }
    @Override
    public int calculateSeatPrice(){
        return numberOfSeats*pricePerseat;
    }
}
