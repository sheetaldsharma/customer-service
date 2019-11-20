package com.eshopper.customerservice.model;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="customers")
public class Customer {

    @Id
    @Column(name = "customerid")
    private Integer customerId;

    @Column(name = "password")
    private String password ;

    @Column(name = "firstname")
    private String firstName ;

    @Column(name = "middlename")
    private String middleName ;

    @Column(name = "lastname")
    private String lastName ;

    @Column(name = "address1")
    private String address1 ;

    @Column(name = "address2")
    private String address2 ;

    @Column(name = "city")
    private String city ;

    @Column(name = "state")
    private String state ;

    @Column(name = "postalcode")
    private Integer postalCode ;

    @Column(name = "email")
    private String email ;

    @Column(name = "phone1")
    private Integer phone1 ;

    @Column(name = "phone2")
    private Integer phone2 ;

    @Column(name = "registareddate")
    private Date registaredDate;

    public Customer() {
    }

    public Customer(Integer customerId, String password, String firstName, String middleName, String lastName, String address1, String address2, String city, String state, Integer postalCode, String email, Integer phone1, Integer phone2, Date registaredDate) {
        this.customerId = customerId;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.registaredDate = registaredDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone1() {
        return phone1;
    }

    public void setPhone1(Integer phone1) {
        this.phone1 = phone1;
    }

    public Integer getPhone2() {
        return phone2;
    }

    public void setPhone2(Integer phone2) {
        this.phone2 = phone2;
    }

    public Date getRegistaredDate() {
        return registaredDate;
    }

    public void setRegistaredDate(Date registaredDate) {
        this.registaredDate = registaredDate;
    }
}
