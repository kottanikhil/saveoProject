package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.SmallScale;

@Service
public class SmallScaleDao {

	@Autowired 
	SmallScaleRepository smallScaleRepository;

	public void registerHosp(SmallScale smallScale) {
		smallScaleRepository.save(smallScale);
		
	}
}
