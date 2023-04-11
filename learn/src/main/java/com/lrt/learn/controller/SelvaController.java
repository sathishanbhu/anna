package com.lrt.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrt.learn.entity.SelvaTable;
import com.lrt.learn.service.SelvaService;

@RestController
@RequestMapping("learn")
public class SelvaController {
	
	@Autowired
	public SelvaService selva;
	
	@PostMapping("/save")
	public SelvaTable save(@RequestBody SelvaTable req) {
		SelvaTable tab= selva.saveData(req);
		return tab;
	}
	
	@GetMapping("get-all")
	public List<SelvaTable> getAll() {
		List<SelvaTable> res= selva.getAll();
		return res;
		
	}
	

}
