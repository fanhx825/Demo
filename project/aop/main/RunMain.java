package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.AService;
import aop.impl.BServiceImpl;

public class RunMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:*/applicationContext.xml");//classpath:
		AService aService = context.getBean("aService", AService.class);
		BServiceImpl bServiceImpl = context.getBean("bService", BServiceImpl.class);

		aService.barA();
	}
}
