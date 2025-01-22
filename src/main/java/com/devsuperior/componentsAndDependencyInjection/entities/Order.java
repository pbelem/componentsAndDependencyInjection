package com.devsuperior.componentsAndDependencyInjection.entities;

public class Order {

    int code;
    double basic;
    double discount;

    public Order() {
    }

    public Order(int code, double basic , double discount) {
        this.basic = basic;
        this.code = code;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
