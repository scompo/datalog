package com.github.scompo.datalog.api.v1.users;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.github.scompo.commons.JpaBean;

@Entity
public class User implements JpaBean {

	private static final long serialVersionUID = 2994866902496158637L;

	@Id
	private String username;

	@Embedded
	private Details details;

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public Details getDetails() {

		return details;
	}

	public void setDetails(Details details) {

		this.details = details;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		
		return "User [username=" + username + ", details=" + details + "]";
	}
}
