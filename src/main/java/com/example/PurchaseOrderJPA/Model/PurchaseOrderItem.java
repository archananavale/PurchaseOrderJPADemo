package com.example.PurchaseOrderJPA.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String itemName;
    private double itemPrice;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "po_id")
    private PurchaseOrder purchaseOrder;//forein key
}
