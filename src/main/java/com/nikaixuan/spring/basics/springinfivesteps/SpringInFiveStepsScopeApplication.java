package com.nikaixuan.spring.basics.springinfivesteps;

import com.nikaixuan.spring.basics.springinfivesteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsScopeApplication.class);
	public static void main(String[] args) {


		ApplicationContext applicationContext =
				SpringApplication.run(SpringInFiveStepsScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO2);

		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}
}
