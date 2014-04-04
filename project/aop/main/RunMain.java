package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.AService;
import aop.impl.BServiceImpl;

/**
 * @description 使用spring aop编程，感受spring aop的过程
 * @author hongxingfan
 * @since 2014年4月4日  下午5:29:55
 * @summarize 所有过程都是自己一步步做的，包括每一个spring aop依赖的包，注意类路径的写法
 */
public class RunMain {
	
	public static void main(String[] args) {
		// 注意切类路径的写法
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/applicationContext.xml");//classpath:
		AService aService = context.getBean("aService", AService.class);
		BServiceImpl bServiceImpl = context.getBean("bService", BServiceImpl.class);

		aService.barA();
	}
}
