package com.java.dragan.PetStoreApp.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name =  "users", uniqueConstraints = @UniqueConstraint(columnNames = "username"))

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String FirstName;
    private String LastName;
    private String EmailAddress;


    @OneToMany( cascade = CascadeType.ALL)
    private List<PurchaseOrder> purchaseOrders;

    private  long Budget;


    public Users(int i, String dragan, String masina123, String pavic, String adresssa1, int i1) {
    }
}
