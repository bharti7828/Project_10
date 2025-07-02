package com.rays.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PurchaseOrderDTO;

@Repository
public class PurchaseOrderDAOImpl extends BaseDAOImpl<PurchaseOrderDTO> implements PurchaseOrderDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PurchaseOrderDTO dto, CriteriaBuilder builder,
			Root<PurchaseOrderDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<PurchaseOrderDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
