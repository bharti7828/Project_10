package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table (name = "ST_PURCHASEORDER")
public class PurchaseOrderDTO  extends BaseDTO{
	
	@Column(name = "TOTAL_QUANTITY")
	private long totalQuantity;
	
	
	@Column(name = "PRODUCT", length = 50)
	private String product;
	
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	
	
	@Column(name = "TOTAL_COST")
	private long totalCost;
	

	public long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(long totalQuantity) {
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

	public long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}
	
	public String getKey() {
		return product;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "product";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("product", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("product", product);
		return map;
	}

}
