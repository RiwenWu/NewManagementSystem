package com.wrw.newmanagementsystem.org.entity;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEntity {

	private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void beforeClass() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	
	public static void main(String[] args){
		beforeClass();
	}

}
