package com.example.PurchaseOrderJPA.Repository;

import com.example.PurchaseOrderJPA.Model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Integer> {
}
