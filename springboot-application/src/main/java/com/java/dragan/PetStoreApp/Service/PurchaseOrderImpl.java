package com.java.dragan.PetStoreApp.Service;



import com.java.dragan.PetStoreApp.Models.Pets;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;

@Service
public class PurchaseOrderImpl implements PurchaseOrderService {


    //This is the Service Class layer for the PurchaseOrder of the Pets
    // The code and math is done with Array
    private Pets[] pets;
    private int price;
    private double totalPrice;
    private Date dateOfBirth;

    public PurchaseOrderImpl() {
        pets = new Pets[20];

    }
    public PurchaseOrderImpl(int dateOfBirth) {
        pets = new Pets[dateOfBirth];

    }
    public double calculateTotalPrice() {
        for (int i = 0; i < pets.length; i++) {
            totalPrice += pets[i].getPrice();
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "PurchaseOrderImpl{" +
                "pets=" + Arrays.toString(pets) +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }



    @Override
    public double costOfCats() {
        return totalPrice;
    }

    @Override
    public double costOfDogs() {
        return totalPrice;
    }

}








