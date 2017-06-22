/**
 * @projectName SimpleCommand
 * @fileName CanRun.java
 * @description
 * @author lifl
 * @time 2017обнГ2:32:23
 *
 */
package com.command001.base;

import com.command001.mes.MessageUnit;
import com.test.TestUser;

public interface CanRun {
	/**
	 * insert body
	 */
	public void excute(TestUser user,MessageUnit unit);
}

