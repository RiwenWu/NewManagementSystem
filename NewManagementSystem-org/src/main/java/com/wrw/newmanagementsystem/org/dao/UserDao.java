package com.wrw.newmanagementsystem.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.wrw.newmanagementsystem.common.dao.CommonDao;
import com.wrw.newmanagementsystem.org.entity.Resource;
import com.wrw.newmanagementsystem.org.entity.User;

/**
 * @author wrw
 *
 */
public interface UserDao extends SystemUserDao,CommonDao<User,String>{

	@Query("select u from User u where u.deleteFlag = 0 and u.username=?1 ")
	List<User> findUserByName(String userName);
	
	@Query("select DISTINCT re from User u join u.roles r join r.resources re where r.deleteFlag = 0 and re.deleteFlag = 0 and u.id = ?1 ")
	public List<Resource> findResourcesByUserId(String userId);
}
