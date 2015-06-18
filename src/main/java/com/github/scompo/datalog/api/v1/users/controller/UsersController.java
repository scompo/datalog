package com.github.scompo.datalog.api.v1.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.scompo.datalog.api.v1.Version1ApiUris;
import com.github.scompo.datalog.api.v1.users.User;
import com.github.scompo.datalog.api.v1.users.UserList;
import com.github.scompo.datalog.api.v1.users.service.UsersService;

@RestController
@RequestMapping(value = Version1ApiUris.USERS_URI)
public class UsersController {

	private static final Logger logger = LoggerFactory
			.getLogger(UsersController.class);

	@Autowired
	private UsersService usersService;

	@RequestMapping(method = RequestMethod.GET)
	public UserList getAll() {

		logger.info("Called getAll");

		return usersService.getAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public User create(User userToCreate) {

		logger.info("Called create with userToCreate={}", userToCreate);

		return usersService.create(userToCreate);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public User read(@PathVariable String username) {

		logger.info("Called read with username={}", username);

		return usersService.read(username);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public User update(User userToUpdate) {

		logger.info("Called update with userToUpdate={}", userToUpdate);

		return usersService.update(userToUpdate);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(String username) {

		logger.info("Called delete with username={}", username);

		usersService.delete(username);
	}
}
