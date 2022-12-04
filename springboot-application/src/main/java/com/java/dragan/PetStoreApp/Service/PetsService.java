package com.java.dragan.PetStoreApp.Service;


import com.java.dragan.PetStoreApp.Models.Pets;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetsService {


    //Get all Pets
    List<Pets> getAllPets();


    //Create Pets
    public Pets createPets(Pets pets ) throws Exception;

    //Save Pets
    Pets SavePets(Pets pets);


}
