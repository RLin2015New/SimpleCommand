/**
 * @projectName SimpleCommand
 * @fileName BaseParams.java
 * @description
 * @author lifl
 * @time 2017обнГ2:59:22
 *
 */
package com.command001.base;

import com.command001.mes.MessageUnit;

public class BaseParams {
	/**
	 * SimpleCommand
	 * TODO
	 */
	private String content;
	public static BaseParams decode(MessageUnit unit){
		BaseParams bp =  new BaseParams();
		bp.setContent(new String(unit.getContent()));
		return bp; 
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

