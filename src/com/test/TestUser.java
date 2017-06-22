/**
 * @projectName SimpleCommand
 * @fileName TestUser.java
 * @description
 * @author lifl
 * @time 2017обнГ2:33:49
 *
 */
package com.test;

public class TestUser {
	
	private long userid;
	/**
	 * SimpleCommand
	 * TODO
	 */
	public static TestUser getUserById(long id){
		TestUser t = new TestUser();
		t.setUserid(id);
		return t;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
}

