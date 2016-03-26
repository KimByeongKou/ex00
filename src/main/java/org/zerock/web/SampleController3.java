package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController3.class);
	
	
	/*
	 * Model객체를 사용할 경우 객체 전달이 가능하다.
	 */
	@RequestMapping("/doD")
	public String doD(Model model){
		
		//make sample data
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		logger.info("doD");
	
		model.addAttribute(product);
		
		return "productDetail";
		
	}
	
}


