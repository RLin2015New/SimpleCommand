/**
 * @projectName SimpleCommand
 * @fileName ParamsParse.java
 * @description
 * @author lifl
 * @time 2017обнГ3:00:05
 *
 */
package com.command001.base;

import com.command001.mes.MessageUnit;

public interface ParamsParse {
	/**
	 * insert body
	 */
	public BaseParams decode(MessageUnit unit);
	public MessageUnit encode(BaseParams response);
}

