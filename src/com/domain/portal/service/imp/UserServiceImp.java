package com.domain.portal.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.portal.entity.User;
import com.domain.portal.service.UserDao;
import com.domain.portal.service.UserService;

@Service
public class UserServiceImp implements UserService {
 
   @Autowired
   private UserDao userDao;
 
   @Transactional
   public void save(User user) {
      userDao.save(user);
   }
 
   @Transactional(readOnly = true)
   public List<User> list() {
      return userDao.list();
   }

	@Override
	public User find(String email) {
		return userDao.find(email);
	}
   
}