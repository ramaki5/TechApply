package com.worktech.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.worktech.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager manager;
	
	public void saveUser(User user) {
		manager.persist(user);
	}
}
