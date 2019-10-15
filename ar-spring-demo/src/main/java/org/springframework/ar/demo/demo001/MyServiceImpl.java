package org.springframework.ar.demo.demo001;

import org.springframework.stereotype.Service;

@Service("myService")
public class MyServiceImpl implements MyService {

	/**
	 * @author ArLandlate
	 * project: spring demo
	 * usefor: test service
	 */

	/**
	 * test method
	 */
	public void test(){
		System.out.println("Everything is worked!");
	}

}
