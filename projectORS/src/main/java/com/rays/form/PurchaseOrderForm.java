package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;

public class PurchaseOrderForm extends BaseForm {

    @NotNull(message = "Please enter Total Quantity")
    private Long totalQuantity;

    @NotEmpty(message = "Please enter Product")
    private String product;

    @NotNull(message = "Please enter Order Date")
    private Date orderDate;

    @NotNull(message = "Please enter Total Cost")
    private Long totalCost;

    // --- Getters and Setters ---

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }
}
