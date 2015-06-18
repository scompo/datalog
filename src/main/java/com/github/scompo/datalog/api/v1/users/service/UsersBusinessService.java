package com.github.scompo.datalog.api.v1.users.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static com.github.scompo.commons.LogHelper.*;
import com.github.scompo.datalog.api.v1.users.User;
import com.github.scompo.datalog.api.v1.users.UserList;
import com.github.scompo.datalog.api.v1.users.dao.UsersDao;

@Service
@Transactional
public class UsersBusinessService implements UsersService {

	private static final Logger logger = LoggerFactory
			.getLogger(UsersBusinessService.class);

	@Autowired
	private UsersDao usersDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public User create(User userToCreate) {

		logger.debug("called create with userToCreate={}" + userToCreate);

		User userSaved = usersDao.save(userToCreate);

		logReturn(logger, userSaved);

		return userSaved;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public User update(User userToUpdate) {

		logger.debug("called update with userToUpdate={}" + userToUpdate);

		User userSaved = usersDao.save(userToUpdate);

		logReturn(logger, userSaved);

		return userSaved;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User read(String username) {

		logger.debug("called read with name={}" + username);

		User userFound = usersDao.findOne(username);

		logReturn(logger, userFound);

		return userFound;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(String username) {

		logger.debug("called delete with name={}" + username);

		usersDao.delete(username);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public UserList getAll() {

		logger.debug("called getAll");

		Iterable<User> findAll = usersDao.findAll();

		UserList userList = new UserList();

		for (User user : findAll) {

			userList.add(user);
		}

		logReturn(logger, userList);
		
		return userList;
	}

}
