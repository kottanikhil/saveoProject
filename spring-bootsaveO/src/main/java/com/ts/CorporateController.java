package com.ts;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CorporateDao;
import com.model.Corporate;

@RestController
public class CorporateController {

	@Autowired
	CorporateDao corporateDao;
	
	@RequestMapping("/hiCorporate")
	public String hi(){
		return "Hi welcome to Corporate Hospitals";
	}
	
	@RequestMapping("/registerCorp")
	public void registerCorp(){
		
		Corporate c1=new Corporate();
		c1.setCorporateId(1);
		c1.setCorporateName("Apollo");
		c1.setLocation("Hyd");
		c1.setContact("8985786568");
		c1.setEstablished(new Date());
		c1.setPassword("password");
		c1.setEmailId("apollosec@gmail.com");
		
		corporateDao.register(c1);
		
		
		Corporate c2=new Corporate();
		c2.setCorporateId(2);
		c2.setCorporateName("Yashoda");
		c2.setLocation("Panjagutta");
		c2.setContact("9949472212");
		c2.setEstablished(new Date());
		c2.setPassword("password");
		c2.setEmailId("yashodapan@gmail.com");
		corporateDao.register(c2);
		
	}
	
}
