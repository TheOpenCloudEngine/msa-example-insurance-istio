package com.autoinsurance;

import org.metaworks.springboot.configuration.Metaworks4BaseApplication;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
public class InsuranceServiceApplication extends Metaworks4BaseApplication {

	/**
	 * @param dataSource
	 * @param properties
	 * @param jtaTransactionManagerProvider
	 */
	protected InsuranceServiceApplication(DataSource dataSource, JpaProperties properties,
										  ObjectProvider<JtaTransactionManager> jtaTransactionManagerProvider,
										  ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
		super(dataSource, properties, jtaTransactionManagerProvider, transactionManagerCustomizers);
	}





	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		new SpringApplicationBuilder(InsuranceServiceApplication.class).web(true).run(args);

	}

}