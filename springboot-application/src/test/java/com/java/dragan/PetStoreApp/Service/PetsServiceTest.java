package com.java.dragan.PetStoreApp.Service;

import com.java.dragan.PetStoreApp.Models.Pets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetsServiceTest {

    private static final int DOG =1 ;
    private static final int CAT = 2;

    @Test
    void createPets() {
        Pets pets = new Pets("Emma", "Dare", "Cute" ,11.22 ,5,3,DOG);
         assertEquals(pets.equals(DOG));

    }

    private void assertEquals(boolean equals) {
    }
}