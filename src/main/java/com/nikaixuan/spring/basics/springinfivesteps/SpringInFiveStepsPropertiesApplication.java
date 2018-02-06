package com.nikaixuan.spring.basics.springinfivesteps;

import com.nikaixuan.spring.basics.springinfivesteps.basic.BinarySearchImpl;
import com.nikaixuan.spring.basics.springinfivesteps.properties.SomeExternalServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringInFiveStepsPropertiesApplication {

	public static void main(String[] args) {

		//What are the beans? Add component
		//What are the dependencies of beans? Add autowired
		//Where to search for beans? Have auto scanned,no need.


		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BuddleSort());
		//System.out.println(result);
		ApplicationContext applicationContext =
				SpringApplication.run(SpringInFiveStepsPropertiesApplication.class, args);
		SomeExternalServices service = applicationContext.getBean(SomeExternalServices.class);
		System.out.println(service);


	}
}
