package com.java.dragan.PetStoreApp.Repository;

import com.java.dragan.PetStoreApp.Models.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository  extends JpaRepository<PurchaseOrder, Long> {
}