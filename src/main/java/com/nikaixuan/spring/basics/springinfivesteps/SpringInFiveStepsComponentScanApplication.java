package com.nikaixuan.spring.basics.springinfivesteps;

import com.nikaixuan.spring.basics.componentscan.ComponentDAO;
import com.nikaixuan.spring.basics.springinfivesteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nikaixuan.spring.basics.componentscan")
public class SpringInFiveStepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsComponentScanApplication.class);
	public static void main(String[] args) {


		ApplicationContext applicationContext =
				SpringApplication.run(SpringInFiveStepsComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
	}
}
