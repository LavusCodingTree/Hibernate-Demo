package com.js.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		UserData ud = new UserData();
		ud.setEmail("abc@gmail.com");
		ud.setPhone(12345678);

		User u = new User();
		u.setId(1);
		u.setName("aaa");
		u.setAge(24);

		u.setUd(ud);

		et.begin();
		em.persist(u);
		et.commit();
	}
}
