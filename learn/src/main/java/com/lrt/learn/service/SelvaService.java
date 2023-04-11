package com.lrt.learn.service;

import java.util.List;

import com.lrt.learn.entity.SelvaTable;

public interface SelvaService {

	SelvaTable saveData(SelvaTable req);

	List<SelvaTable> getAll();

}
