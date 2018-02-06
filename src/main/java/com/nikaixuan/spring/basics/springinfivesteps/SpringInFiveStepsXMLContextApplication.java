package com.nikaixuan.spring.basics.springinfivesteps;

import com.nikaixuan.spring.basics.springinfivesteps.basic.BinarySearchImpl;
import com.nikaixuan.spring.basics.springinfivesteps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringInFiveStepsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsXMLContextApplication.class);

	public static void main(String[] args) {

		//What are the beans? Add component
		//What are the dependencies of beans? Add autowired
		//Where to search for beans? Have auto scanned,no need.

		try(ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")){
			LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			XMLPersonDAO personDAO =
					applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDAO);
			System.out.println(personDAO.getJdbcConnection());

		}
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BuddleSort());
		//System.out.println(result);
//		ApplicationContext applicationContext =
//				SpringApplication.run(SpringInFiveStepsXMLContextApplication.class, args);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		int result = binarySearch.binarySearch(new int[] {3,2,1},3);
//		System.out.println(result);

	}
}
