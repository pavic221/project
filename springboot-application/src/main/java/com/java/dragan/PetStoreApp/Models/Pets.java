package com.java.dragan.PetStoreApp.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Pets {


       @Id
      @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;



        private String Name;
        private String Owner;
        private String Description;
       @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
        private Date DateOfBirth;
        private long Price;
        private int Rating;
        private String type;

    @ManyToOne
    @JoinColumn(name="purchase_id", nullable = false)
    private PurchaseOrder PurchaseOrder;


    public Pets(String emma, String dare, String cute, double v, int i, int i1, int dog) {
    }
}




