/**
 * @projectName SimpleCommand
 * @fileName CommandA.java
 * @description
 * @author lifl
 * @time 2017下午2:35:15
 *
 */
package com.command001;

import java.util.HashMap;

import com.command001.base.BaseCommand;
import com.command001.base.BaseParams;
import com.command001.mes.MessageUnit;
import com.test.TestUser;

public class CommandA extends BaseCommand {
	static
	{
		functionMapper = new HashMap<String, String>();
		functionMapper.put(""+1, "test");
	}
	
	@Override
	public void excute(TestUser user, MessageUnit unit) {
		BaseParams params = BaseParams.decode(unit);
		String code = ""+unit.getCode();
		if (functionMapper.containsKey(code)) {
			String methodNameString = functionMapper.get(code);
			try {
				this.getClass().getMethod(methodNameString,TestUser.class,BaseParams.class).invoke(this,user,params);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("没找到方法");
			}
			
		}
	}
	
	public void test(TestUser user, BaseParams params){
		System.out.println(user.getUserid()+" : commandA test content is "+params.getContent());
	}

	

}

