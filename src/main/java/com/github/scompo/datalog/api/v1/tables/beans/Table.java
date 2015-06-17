package com.github.scompo.datalog.api.v1.tables.beans;

import com.github.scompo.datalog.api.v1.users.bean.User;

public class Table {

	private Long id;

	private String name;

	private User creator;

	public Table() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Table [id=" + id + ", name=" + name + ", creator=" + creator
				+ "]";
	}

}
