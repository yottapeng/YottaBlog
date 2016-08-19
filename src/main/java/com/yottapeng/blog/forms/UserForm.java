package com.yottapeng.blog.forms;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author yottapeng<i@yottapeng.com>.
 */
@Data
public class UserForm {
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@NotNull
    private String password;

    @NotNull
    private String newPassword;
}
