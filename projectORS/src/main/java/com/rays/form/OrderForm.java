
package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm {

	@NotEmpty(message = "please enter productName")
	private String productName;

	@NotNull(message = "please enter orderDate")
	private Date orderDate;
    
	@NotNull(message = "please enter quantity")
	private Long quantity;

	@NotEmpty(message = "please enter customer")
	private String customer;
	
	

	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Long getQuantity() {
		return quantity;
	}



	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}



	public String getCustomer() {
		return customer;
	}



	public void setCustomer(String customer) {
		this.customer = customer;
	}



	public BaseDTO getDto() {

		OrderDTO dto = initDTO(new OrderDTO());

		dto.setProductName(productName);
		dto.setOrderDate(orderDate);
		dto.setQuantity(quantity);
		dto.setCustomer(customer);

		System.out.println("all data are done ");

		return dto;
	}
}
