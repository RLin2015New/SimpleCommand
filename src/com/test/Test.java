/**
 * @projectName SimpleCommand
 * @fileName Test.java
 * @description
 * @author lifl
 * @time 2017обнГ4:15:16
 *
 */
package com.test;

import com.command001.DispatchMessage;
import com.command001.mes.MessageUnit;

public class Test {

	public static void main(String[] args) {
		/**
		 * test command
		 */
		DispatchMessage dispatch = new DispatchMessage();
		MessageUnit unit = new MessageUnit();
		unit.setCode(1);
		unit.setUserid(100);
		unit.setContent("testContent".getBytes());
		dispatch.dispatch(unit);
	}
	/**
	 * SimpleCommand
	 * TODO
	 */
}

