package com.hcl.javajunit.student.repository;

import java.util.List;

import com.hcl.javajunit.student.model.Student;

public class H2StudentRepository implements StudentRepository {
	/*
	private EntityManager entityManager = null;
	
	public H2StudentRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jbd-pu");
		entityManager = emf.createEntityManager();
	}
*/
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDataFromMemory() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * This is same as the crud applicatin you build
	public void add(StudentEnt student) {
		transaction = entityManager.getTransaction();
		transaction.begin();

		entityManager.persist(student);
		transaction.commit();
	}
	*/

}
