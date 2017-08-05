package com.wrw.newmanagementsystem.org.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wrw.newmanagementsystem.org.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testUserService {

	@Resource
	private UserService userService;
	
	@Test
	public void test() {
		System.out.println("123");
	}
	
	@Test
	public void testFindUserByName() {
		User u = new User();
		u = userService.findUserByName("admin");
		Assert.assertNotNull(u);
		System.out.println(u.getRealName());
	}
	
	@Test
	public void testFindUsers() {
		User u = new User();
		Map<String, Object> map = new HashMap<String, Object>();
		userService.findUsers(map);
		System.out.println(map.size());
	}

	@Test
	public void testFindResourcesByUserId() {
		List list = new ArrayList<Resource>();
		list = userService.findResourcesByUserId("4028821e5b7a6947015b7a6ebacf0000");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
