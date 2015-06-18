package com.github.scompo.datalog.api.v1.users.dao;

import org.springframework.data.repository.CrudRepository;

import com.github.scompo.datalog.api.v1.users.User;

public interface UsersDao extends CrudRepository<User, String>{

}
