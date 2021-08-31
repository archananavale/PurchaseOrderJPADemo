package com.example.PurchaseOrderJPA.Repository;

import com.example.PurchaseOrderJPA.Model.PurchaseOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseOrderItemRepository extends JpaRepository<PurchaseOrderItem,Integer> {

   // @Query("select p from PurchaseOrderItem where po_id=?1")
//    List<PurchaseOrderItem> findAllPurchaseOrderItemForID(Integer po_id);
}
