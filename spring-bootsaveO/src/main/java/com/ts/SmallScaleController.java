package com.ts;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.SmallScaleDao;

import com.model.SmallScale;

@RestController
public class SmallScaleController {

	@Autowired
	SmallScaleDao smallScaleDao;
	
	@RequestMapping("/hiSmallScale")
	public String hi(){
		return "Hi welcome to Small scale Hospitals";
	}
	
	
	@RequestMapping("/registerSmall")
	public void registerSmall(){
		SmallScale s1=new SmallScale();
		s1.setSmallScaleId("S01");
		s1.setSmallScaleName("SRI BALAJI");
		s1.setContact("9885738171");
		s1.setLocation("Dilshuknagar");
		s1.setEmailId("balaji@gmail.com");
		s1.setPassword("balaji");
		
		smallScaleDao.registerHosp(s1);
		
		SmallScale s2=new SmallScale();
		s2.setSmallScaleId("S02");
		s2.setSmallScaleName("RAINBOW");
		s2.setContact("9885768171");
		s2.setLocation("Vidynagar");
		s2.setEmailId("rainbow@gmail.com");
		s2.setPassword("rainbow");
		
		smallScaleDao.registerHosp(s2);
	}
}
