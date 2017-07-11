package com.yang.provider;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yang.service.TestService;
public class TestServiceTest {
	@Test
	public void test() throws IOException{
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springContext.xml");
		
		classPathXmlApplicationContext.start();
		
		TestService bean = (TestService) classPathXmlApplicationContext.getBean("testService");
		
		System.out.println(bean.getName());
		
		System.in.read();
	}
}
