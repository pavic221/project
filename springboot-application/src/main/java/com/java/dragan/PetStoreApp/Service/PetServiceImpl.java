package com.java.dragan.PetStoreApp.Service;




import com.java.dragan.PetStoreApp.Models.Pets;
import com.java.dragan.PetStoreApp.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetsService {



    //This is the Service class for Pets here is written the code that
    // Create , Save and List to added Pets .


    @Autowired
    PetRepository  petRep;


    @Override
    public Pets createPets(Pets  pets) throws Exception {

        Pets local=this.petRep.findbyType(pets.getType());

        return null;
    }

    @Override
    public Pets SavePets(Pets pets) {
        return petRep.save(pets);
    }

    @Override
    public List<Pets> getAllPets() {
        return petRep.findAll();
    }
}


