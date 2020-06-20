package com.retalcar.bus.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/12 0012 19:30
 */
public class Car {

    /**
     *
     */
    private String carnumber;

    /**
     *
     */
    private String cartype;

    /**
     *
     */
    private String color;

    /**
     *
     */
    private Double price;

    /**
     *
     */
    private Double rentprice;

    /**
     *
     */
    private Double deposit;

    /**
     *
     */
    private Integer isrenting;

    /**
     *
     */
    private String description;

    /**
     *
     */
    private String carimg;

    /**
     *
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRentprice() {
        return rentprice;
    }

    public void setRentprice(Double rentprice) {
        this.rentprice = rentprice;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Integer getIsrenting() {
        return isrenting;
    }

    public void setIsrenting(Integer isrenting) {
        this.isrenting = isrenting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCarimg() {
        return carimg;
    }

    public void setCarimg(String carimg) {
        this.carimg = carimg;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
