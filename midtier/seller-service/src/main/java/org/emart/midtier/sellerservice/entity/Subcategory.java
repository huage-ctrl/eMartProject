package org.emart.midtier.sellerservice.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * subcategory of each categories(Subcategory)实体类
 *
 * @author makejava
 */
@Entity
@Data
@Table(name="subcategory")
public class Subcategory implements Serializable {
    private static final long serialVersionUID = 295241932706891184L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="subcategory_id")
    private Long subcategoryId;
    /**
    * subcategory name
    */
    @Column(name="subcategory_name")
    private String subcategoryName;
    /**
    * category id
    */
    @Column(name="category_id")
    private Long categoryId;
    /**
    * brief about subcategory
    */
    @Column(name="brief_detail")
    private String briefDetail;
    
    private Double gst;
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

    public Long getsubcategoryId() {
        return subcategoryId;
    }

    public void setsubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getBriefDetail() {
        return briefDetail;
    }

    public void setBriefDetail(String briefDetail) {
        this.briefDetail = briefDetail;
    }

    public Double getGst() {
        return gst;
    }

    public void setGst(Double gst) {
        this.gst = gst;
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
