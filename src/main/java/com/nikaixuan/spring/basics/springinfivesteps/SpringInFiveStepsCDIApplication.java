package com.nikaixuan.spring.basics.springinfivesteps;

import com.nikaixuan.spring.basics.springinfivesteps.cdi.SomeCDIBusiness;
import com.nikaixuan.spring.basics.springinfivesteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsCDIApplication.class);
	public static void main(String[] args) {


		ApplicationContext applicationContext =
				SpringApplication.run(SpringInFiveStepsCDIApplication.class, args);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao-{}", someCDIBusiness,someCDIBusiness.getSomeCDIDAO());
	}
}
