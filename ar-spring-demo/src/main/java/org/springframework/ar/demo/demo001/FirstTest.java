package org.springframework.ar.demo.demo001;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstTest {

	/**
	 * @author ArLandlate
	 * project: spring demo
	 * usefor: test if it works or not
	 */

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		MyService myService = (MyService) context.getBean("myService");
		myService.test();
	}

}
