package com.java.dragan.PetStoreApp.Models;

import com.java.dragan.PetStoreApp.CONSTANTS.CONSTANTS;
import lombok.*;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Mammals extends  Pets{

     CONSTANTS DOG ;
     CONSTANTS CAT ;
    int typeOfMammal;


    @Override
    public String toString() {
        return this.DOG + " dog " + this.CAT + "cat";
    }
}
