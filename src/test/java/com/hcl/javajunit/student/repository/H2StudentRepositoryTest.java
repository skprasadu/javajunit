package com.hcl.javajunit.student.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class H2StudentRepositoryTest {

	private StudentRepository sr;
	@Before
	public void setUp() throws Exception {
		sr = new H2StudentRepository();
		/*
		H2StudentRepository hr = (H2StudentRepository)sr;
		hr.add(new StudentEnt(1l, "mkyong", 25))
		hr.add(new StudentEnt(2l, "jack", 30))
		*/
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsDataFromMemory() {
		fail("Not yet implemented");
	}

}
