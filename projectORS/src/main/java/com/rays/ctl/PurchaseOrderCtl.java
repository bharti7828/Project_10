package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.PurchaseOrderDTO;
import com.rays.form.PurchaseOrderForm;
import com.rays.service.PurchaseOrderServiceInt;

@RestController
@RequestMapping(value = "PurchaseOrder")
public class PurchaseOrderCtl extends BaseCtl<PurchaseOrderForm, PurchaseOrderDTO, PurchaseOrderServiceInt>{

	@Autowired
	private PurchaseOrderServiceInt purchaseService;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		  PurchaseOrderDTO dto = new PurchaseOrderDTO();
		List<DropdownList> list = purchaseService.search(dto, userContext);
		res.addResult("inlist", list);
		return res;
	}
}
