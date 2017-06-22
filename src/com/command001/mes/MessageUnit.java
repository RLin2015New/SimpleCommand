/**
 * @projectName SimpleCommand
 * @fileName MessageUnit.java
 * @description
 * @author lifl
 * @time 2017ÏÂÎç2:44:40
 *
 */
package com.command001.mes;

public class MessageUnit {
	/**
	 * SimpleCommand
	 * TODO
	 */
	private int length;
	private int code;
	private long userid;
	private int check;
	private byte[] content;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	
}

