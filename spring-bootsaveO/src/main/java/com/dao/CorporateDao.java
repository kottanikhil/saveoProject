package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Corporate;

@Service
public class CorporateDao {
	
@Autowired
CorporateRepository corporateRepository;

public void register(Corporate corporate) {
	corporateRepository.save(corporate);
	
}

}
