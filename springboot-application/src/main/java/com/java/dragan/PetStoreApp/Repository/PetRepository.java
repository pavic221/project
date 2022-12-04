package com.java.dragan.PetStoreApp.Repository;

import com.java.dragan.PetStoreApp.Models.Pets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PetRepository extends JpaRepository<Pets, Long> {

    @Query("Select p from Pets p where p.type = :type")
    Pets findbyType(String type);
}
