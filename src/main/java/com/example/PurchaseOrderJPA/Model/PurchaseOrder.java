package com.example.PurchaseOrderJPA.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String custName;
    private  String address;


    @JsonManagedReference
    @OneToMany(mappedBy = "purchaseOrder",cascade = CascadeType.ALL)

    private List<PurchaseOrderItem> purchaseOrderItemList;

}
