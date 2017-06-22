/**
 * @projectName SimpleCommand
 * @fileName BaseCommand.java
 * @description
 * @author lifl
 * @time 2017обнГ2:33:19
 *
 */
package com.command001.base;

import java.util.Map;

import com.test.TestUser;

public abstract class BaseCommand implements CanRun {
	protected static Map<String, String> functionMapper;
	private TestUser testUser;

	/**
	 * SimpleCommand TODO
	 */

	public TestUser getTestUser() {
		return testUser;
	}

	public void setTestUser(TestUser testUser) {
		this.testUser = testUser;
	}

}
