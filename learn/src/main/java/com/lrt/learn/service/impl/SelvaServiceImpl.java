package com.lrt.learn.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrt.learn.entity.SelvaTable;
import com.lrt.learn.repo.SelvaRepo;
import com.lrt.learn.service.SelvaService;

@Service
public class SelvaServiceImpl implements SelvaService {

	@Autowired
	public SelvaRepo repo;

	@Override
	public SelvaTable saveData(SelvaTable req) {
		
		SelvaTable tab= repo.save(req);
		return tab;
	}

	@Override
	public List<SelvaTable> getAll() {
		List<SelvaTable> data=repo.findAll();
		return data;
	}

}
