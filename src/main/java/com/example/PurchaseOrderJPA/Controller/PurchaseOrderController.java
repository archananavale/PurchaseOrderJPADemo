package com.example.PurchaseOrderJPA.Controller;

import com.example.PurchaseOrderJPA.Model.PurchaseOrder;
import com.example.PurchaseOrderJPA.Repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @PostMapping("/SavePurchaseOrder")
    public String savePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        purchaseOrderRepository.save(purchaseOrder);
        return "Data saved";
    }

    @GetMapping("/getAllPurchaseOrder")
    public List<PurchaseOrder> getAllPurchaseOrder(){
        return purchaseOrderRepository.findAll();
    }
    @GetMapping("/getAllPurchaseOrderForId/{custID}")
    public Optional<PurchaseOrder> getAllPurchaseOrderForId(@PathVariable Integer custID){
        return purchaseOrderRepository.findById(custID);
    }





}
