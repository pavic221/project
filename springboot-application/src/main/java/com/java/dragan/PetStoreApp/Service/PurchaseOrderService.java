package com.java.dragan.PetStoreApp.Service;


import org.springframework.stereotype.Service;

@Service
public interface PurchaseOrderService {

    public double calculateTotalPrice();
    public double costOfCats();
    public double costOfDogs();
}



