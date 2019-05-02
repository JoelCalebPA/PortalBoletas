package com.domain.portal.service.imp;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.portal.entity.User;
import com.domain.portal.service.UserDao;

@Repository
public class UserDaoImp implements UserDao {
 
   @Autowired
   private SessionFactory sessionFactory;
 
   @Override
   public void save(User user) {
      sessionFactory.getCurrentSession().save(user);
   }
 
   @Override
   public List<User> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }
	
	@Override
	public User find(String email) {
		Query<User> query = sessionFactory.getCurrentSession().createNamedQuery("from user where email=  :email", User.class);
		return query.getSingleResult();
	}
   
}