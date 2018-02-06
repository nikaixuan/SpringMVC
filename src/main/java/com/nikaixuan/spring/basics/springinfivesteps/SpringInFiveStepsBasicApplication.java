package com.nikaixuan.spring.basics.springinfivesteps;

import com.nikaixuan.spring.basics.springinfivesteps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsBasicApplication {

	public static void main(String[] args) {

		//What are the beans? Add component
		//What are the dependencies of beans? Add autowired
		//Where to search for beans? Have auto scanned,no need.


		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BuddleSort());
		//System.out.println(result);
		ApplicationContext applicationContext =
				SpringApplication.run(SpringInFiveStepsBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {3,2,1},3);
		System.out.println(result);

	}
}
