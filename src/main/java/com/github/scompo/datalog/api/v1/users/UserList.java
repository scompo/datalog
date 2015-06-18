package com.github.scompo.datalog.api.v1.users;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserList extends ArrayList<User> implements List<User>{
	
	private static final long serialVersionUID = -812390631815283565L;

	public UserList() {
		
		super();
	}

	public UserList(Collection<? extends User> c) {
		
		super(c);
	}

	public UserList(int initialCapacity) {
		
		super(initialCapacity);
	}

}
