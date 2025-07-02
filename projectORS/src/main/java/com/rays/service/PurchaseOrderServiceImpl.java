package com.rays.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseDTO;
import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.PurchaseOrderDAOInt;
import com.rays.dto.PurchaseOrderDTO;

@Service
@Transactional
public class PurchaseOrderServiceImpl extends BaseServiceImpl<PurchaseOrderDTO, PurchaseOrderDAOInt> implements PurchaseOrderServiceInt {

	@Override
	public PurchaseOrderDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	}

	
}
