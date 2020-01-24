package com.aventure.service;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@org.springframework.context.annotation.Configuration
//@ComponentScan("com.aventure")
@PropertySource("file:src/main/resources/application.properties")
//@EnableJpaRepositories(entityManagerFactoryRef = "aventureEntityManager", transactionManagerRef = "aventureTransactionManager", basePackages = {"com.aventure.repo"})
public class AventureConfiguration {
	
	  @Value("${spring.datasource.username}")
	  private String username;

	  @Value("${spring.datasource.password}")
	  private String password;

	  @Value("${spring.datasource.url}")
	  private String url;

	  @Value("${spring.datasource.driver-class-name}")
	  private String driver;

	@Primary
	@Bean
	public DataSource dataSource() {
	    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(driver);
	    dataSource.setUrl(url);
	    dataSource.setUsername(username);
	    dataSource.setPassword(password);
	    return dataSource;
	  }
/*
	@Primary
	@Bean(name = "aventureEntityManager")
	  public LocalContainerEntityManagerFactoryBean entityManagerFactory(
	      final EntityManagerFactoryBuilder builder) {
	    return builder.dataSource(dataSource()).packages("com.aventure.repo")
	.build();
	}
	  @Primary
	  @Bean(name = "aventureTransactionManager")
	  public PlatformTransactionManager transactionManager(
	      @Qualifier("aventureEntityManager") EntityManagerFactory entityManagerFactory) {
	    return new JpaTransactionManager(entityManagerFactory);
	  }
	  */
}
	
