package com.eagree;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EagreeApplication.class)
@WebAppConfiguration
public class EagreeApplicationTests {

	@BeforeClass
	public void setup(){
		//Write the code to initialize the units to be tested	
	}
	
	@Test
	public void contextLoads() {
		//Write the test to see the context loads properly
	}

}
