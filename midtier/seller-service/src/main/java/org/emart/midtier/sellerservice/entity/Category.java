package org.emart.midtier.sellerservice.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * list of categories(Category)实体类
 *
 * @author makejava
 */
@Entity
@Data
@Table(name="category")
public class Category implements Serializable {
    private static final long serialVersionUID = -96997654179256627L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
       @Column(name="category_id")
    private Long categoryId;
    /**
    * category name
    */
    @Column(name="category_name")
    private String categoryName;
    /**
    * category brief details
    */
    @Column(name="brief_details")
    private String briefDetails;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBriefDetails() {
        return briefDetails;
    }

    public void setBriefDetails(String briefDetails) {
        this.briefDetails = briefDetails;
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
