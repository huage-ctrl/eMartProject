package org.emart.midtier.buyerservice.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * buyer cart(Cart)实体类
 *
 * @author makejava
 */
@Entity
@Data
@Table(name="cart")
public class Cart implements Serializable {
    private static final long serialVersionUID = -75687248317293954L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
    * buyer ID
    */
    @Column(name="buyer_id")
    private Long buyerId;
    /**
    * seller ID
    */
    @Column(name="seller_id")
    private Long sellerId;
    /**
    * transaction ID
    */
    @Column(name="transaction_id")
    private Long transactionId;
    /**
    * item ID
    */
    @Column(name="item_id")
    private Long itemId;
    /**
    * number of items
    */
    @Column(name="number_of_items")
    private Integer numberOfItems;
    @Column(name="data_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dataTime;
    
    private String remarks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
