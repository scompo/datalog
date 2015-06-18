package com.github.scompo.datalog.test.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.scompo.datalog.api.v1.users.User;
import com.github.scompo.datalog.api.v1.users.service.UsersService;
import com.github.scompo.datalog.test.commons.TransactionalIntegrationTest;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionalIntegrationTest
public class UsersBusinessServiceTest {

	@Autowired
	private UsersService usersService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreate() {

		User userToCreate = null;
		User res = null;

		res = usersService.create(userToCreate);

		assertEquals(userToCreate, res);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRead() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented"); // TODO
	}

}
