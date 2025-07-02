package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.PurchaseOrderDTO;

public interface PurchaseOrderServiceInt extends  BaseServiceInt<PurchaseOrderDTO> {

	public PurchaseOrderDTO findByName(String name, UserContext userContext);
	}