package org.emart.midtier.sellerservice.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * Selling item Details(Item)实体类
 *
 * @author makejava
 */
@Entity
@Data
@Table(name="item")
public class Item implements Serializable {
    private static final long serialVersionUID = 494492609178085512L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
    * categoryid
    */
    @Column(name="category_id")
    private Long categoryId;
    /**
    * subcategoryId
    */
    @Column(name="subcategory_id")
    private Long subcategoryId;

    /**
     * sellerId
     */
    @Column(name="seller_id")
    private Long sellerId;
    /**
    * Commodity price unit is cent
    */
    private Double price;
    /**
    * item name
    */
    @Column(name="item_name")
    private String itemName;
    /**
    * item description
    */
    @Column(name="item_desc")
    private String itemDesc;
    /**
    * quantity in stock
    */
    @Column(name="stock_number")
    private Integer stockNumber;
    /**
    * picture
    */
    private String picture;
    /**
    * remarks
    */
    private String remarks;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date created;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }


    public Long getsubcategoryId() {
        return subcategoryId;
    }

    public void setsubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Integer getstockNumber() {
        return stockNumber;
    }

    public void setstockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
