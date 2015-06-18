package com.github.scompo.datalog.api.v1.users.service;

import com.github.scompo.datalog.api.v1.users.User;
import com.github.scompo.datalog.api.v1.users.UserList;

public interface UsersService {

	User create(User userToCreate);

	User update(User userToUpdate);

	User read(String name);

	void delete(String username);

	UserList getAll();

}
