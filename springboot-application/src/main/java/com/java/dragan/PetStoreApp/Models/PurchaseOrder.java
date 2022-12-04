package com.java.dragan.PetStoreApp.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PurchaseOrder {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long  purchaseId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private Users users ;

   @OneToMany()
   private List<Pets>pets;


    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDate Date;
    private String orderStatus;



}