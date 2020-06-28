package org.emart.midtier.userservice.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * seller login and company details(Seller)实体类
 *
 * @author makejava
 * @since 2020-06-10 23:34:25
 */
@Entity
@Data
@Table(name="seller")
public class Seller implements Serializable {
    private static final long serialVersionUID = -70942673067798224L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
    * username
    */
    private String username;
    /**
    * password
    */
    private String password;
    /**
    * company name
    */
    @Column(name="company_name")
    private String companyName;
    /**
    * gstin
    */
    private Long gstin;
    /**
    * brief about company
    */
    @Column(name="brief_company")
    private String briefCompany;
    /**
    * postal address
    */
    @Column(name="postal_address")
    private String postalAddress;
    /**
    * web_site
    */
    @Column(name="web_site")
    private String webSite;
    /**
    * register an email account
    */
    private String email;

    /**
    * company contact number
    */
    @Column(name="contact_number")
    private String contactNumber;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getGstin() {
        return gstin;
    }

    public void setGstin(Long gstin) {
        this.gstin = gstin;
    }

    public String getBriefCompany() {
        return briefCompany;
    }

    public void setBriefCompany(String briefCompany) {
        this.briefCompany = briefCompany;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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
