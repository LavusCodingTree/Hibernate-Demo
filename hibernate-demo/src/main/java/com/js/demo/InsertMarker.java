package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMarker {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");// connection is established
		EntityManager em = emf.createEntityManager();// to create a table
		EntityTransaction et = em.getTransaction(); // for DML operation like delete, update, insert

		Marker m = new Marker();
		m.setId(5);
		m.setBrand("Domes");
		m.setColor("Brown");
		m.setPrice(35);

		et.begin();
		em.persist(m);
		et.commit();

		System.out.println("Done");

	}

}
