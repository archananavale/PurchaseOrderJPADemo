package com.example.PurchaseOrderJPA.Controller;

import com.example.PurchaseOrderJPA.Model.PurchaseOrder;
import com.example.PurchaseOrderJPA.Model.PurchaseOrderItem;
import com.example.PurchaseOrderJPA.Repository.PurchaseOrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseOrderItemController {
    @Autowired
    private PurchaseOrderItemRepository purchaseOrderItemRepository;

    @PostMapping("/saveNewItem")
    public String saveNewItem(@RequestBody PurchaseOrderItem purchaseOrderItem){
        purchaseOrderItemRepository.save(purchaseOrderItem);
        return "New Details Added";
    }
/*
    @GetMapping("/getPurchaseOrderItemForID/{poId}")
    public List<PurchaseOrderItem> getPurchaseOrderItemForID(@PathVariable Integer poId){

        return  purchaseOrderItemRepository.findAllPurchaseOrderItemForID(poId);
    }
    */
}
