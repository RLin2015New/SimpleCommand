/**
 * @projectName SimpleCommand
 * @fileName DispatchMessage.java
 * @description
 * @author lifl
 * @time 2017обнГ3:06:07
 *
 */
package com.command001;

import java.util.Arrays;
import java.util.List;

import com.command001.mes.MessageUnit;
import com.test.TestUser;

public class DispatchMessage {
	/**
	 * SimpleCommand TODO
	 */
	List<Integer> commandALists = Arrays.asList(1);
	private CommandA commandA = new CommandA();

	public void dispatch(MessageUnit unit) {
		TestUser testUser = TestUser.getUserById(unit.getUserid());
		if (commandALists.contains(unit.getCode())) {
			commandA.excute(testUser, unit);
		}
	}

}
